package com.lan.dailywork.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lan.dailywork.dao.TaskTypeDao;
import com.lan.dailywork.pojo.TaskType;

import java.util.List;

@Service
public class TaskTypeService {

    @Autowired
    private TaskTypeDao taskTypeDao;

//    @Autowired
//    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(TaskType taskType) {
        //基本属性的设置
//        String id = idWorker.nextId()+"";
//        taskType.setId(id);
        taskTypeDao.save(taskType);
    }

    /**
     * 更新
     */
    public void update(TaskType taskType) {
        taskTypeDao.save(taskType);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        taskTypeDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public TaskType findById(String id) {
        return taskTypeDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<TaskType> findAll() {
        return taskTypeDao.findAll();
    }
}
