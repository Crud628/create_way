package com.wkcto.provider;

import com.wkcto.dao.UserInfoDao;
import com.wkcto.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("MyUserDetailService")
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserInfoDao dao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = null;
        UserInfo userinfo = null;
        if( username != null){
            userinfo = dao.findByUsername(username);

            if( userinfo != null){
                List<GrantedAuthority> list = new ArrayList<>();

                //角色必须以ROLE_开头
                GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" +userinfo.getRole());
                list.add(authority);

                //创建User对象
                user = new User(userinfo.getUsername(),userinfo.getPassword(),list);
            }

        }
        return user;
    }
}
