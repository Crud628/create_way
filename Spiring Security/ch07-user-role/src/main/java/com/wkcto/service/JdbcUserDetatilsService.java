package com.wkcto.service;

import com.wkcto.entity.SysRole;
import com.wkcto.entity.SysUser;
import com.wkcto.mapper.SysRoleMapper;
import com.wkcto.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JdbcUserDetatilsService implements UserDetailsService {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //1. 根据username 获取SysUser
        SysUser user  = userMapper.selectSysUser(username);
        System.out.println("loadUserByUsername user:"+user);
        if( user != null){
            //2. 根据userid的，获取role
            List<SysRole> roleList = roleMapper.selectRoleByUser(user.getId());
            System.out.println("roleList:"+ roleList);

            List<GrantedAuthority> authorities = new ArrayList<>();
            String roleName = "";
            for (SysRole role : roleList) {
                roleName  = role.getName();
                GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_"+roleName);
                authorities.add(authority);
            }
            user.setAuthorities(authorities);
            return user;
        }
        return user;
    }
}
