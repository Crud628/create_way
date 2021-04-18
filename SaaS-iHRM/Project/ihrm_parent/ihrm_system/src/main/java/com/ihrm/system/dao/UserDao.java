package com.ihrm.system.dao;

import com.ihrm.domain.system.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author lan
 * @date 2021/4/18 - 16:43
 */
public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {


}
