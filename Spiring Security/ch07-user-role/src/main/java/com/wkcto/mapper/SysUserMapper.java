package com.wkcto.mapper;

import com.wkcto.entity.SysUser;
import org.springframework.stereotype.Repository;

//@Repository :创建dao对象
@Repository
public interface SysUserMapper {

    int insertSysUser(SysUser user);

    //根据账号名称，获取用户信息
    SysUser selectSysUser(String username);
}
