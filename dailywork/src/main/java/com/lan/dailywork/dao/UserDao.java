package com.lan.dailywork.dao;

import com.lan.dailywork.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface UserDao extends JpaRepository<User,String> ,JpaSpecificationExecutor<User> {
}
