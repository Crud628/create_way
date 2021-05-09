package com.bdu.tmanager.dao;

import com.bdu.tmanager.bean.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TeacherDao extends JpaRepository<Teacher,String> ,JpaSpecificationExecutor<Teacher> {
}
