package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface StudentDao extends JpaRepository<Student,String> ,JpaSpecificationExecutor<Student> {
}
