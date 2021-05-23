package com.wkcto.dao;

import com.wkcto.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo,Long> {
    //按照username查询数据库信息
    UserInfo findByUsername(String username);
}
