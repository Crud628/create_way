package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;

/**
 * @author lan
 * @date 2021/4/21 - 22:00
 */
public interface TestDao extends JpaRepository<Test,String>, JpaSpecificationExecutor<Test> {

}
