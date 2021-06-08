package com.lan.dailywork.service;

import com.lan.dailywork.dao.TaskDao;
import com.lan.dailywork.pojo.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskDao taskDao;

    //@Autowired
    //private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(Task task) {
        //基本属性的设置
//        String id = idWorker.nextId()+"";
//        task.setId(id);
        taskDao.save(task);
    }

    /**
     * 更新
     */
    public void update(Task task) {
        taskDao.save(task);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        taskDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Task findById(String id) {
        return taskDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Task> findAll() {
        return taskDao.findAll();
    }
}
