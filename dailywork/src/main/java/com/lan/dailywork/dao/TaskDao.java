package com.lan.dailywork.dao;

import com.lan.dailywork.pojo.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


public interface TaskDao extends JpaRepository<Task,String> ,JpaSpecificationExecutor<Task> {
}
