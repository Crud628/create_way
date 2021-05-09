package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Classteacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface ClassteacherDao extends JpaRepository<Classteacher,String> ,JpaSpecificationExecutor<Classteacher> {
}
