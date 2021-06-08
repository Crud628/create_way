package com.lan.dailywork.dao;

import com.lan.dailywork.pojo.TaskType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaskTypeDao extends JpaRepository<TaskType,String> ,JpaSpecificationExecutor<TaskType> {
}
