package com.wkcto.mapper;

import com.wkcto.entity.SysRole;

import java.util.List;

public interface SysRoleMapper {

   List<SysRole> selectRoleByUser(Integer userId);
}
