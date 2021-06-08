package com.lan.dailywork.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lan.dailywork.dao.UserDao;
import com.lan.dailywork.pojo.User;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

//    @Autowired
//    private IdWorker idWorker;

    /**
     * 保存
     */
    public void add(User user) {
        //基本属性的设置
//        String id = idWorker.nextId()+"";
//        user.setId(id);
        userDao.save(user);
    }

    /**
     * 更新
     */
    public void update(User user) {
        userDao.save(user);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        userDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public User findById(String id) {
        return userDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<User> findAll() {
        return userDao.findAll();
    }
}
