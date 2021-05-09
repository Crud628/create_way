package com.bdu.tmanager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Teacher;
import com.bdu.tmanager.dao.TeacherDao;

import java.util.List;

@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;



    /**
     * 保存
     */
    public void add(Teacher teacher) {
        //基本属性的设置
        String id = "";
        teacher.setId(id);
        teacherDao.save(teacher);
    }

    /**
     * 更新
     */
    public void update(Teacher teacher) {
        teacherDao.save(teacher);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        teacherDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Teacher findById(String id) {
        return teacherDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Teacher> findAll() {
        return teacherDao.findAll();
    }
}
