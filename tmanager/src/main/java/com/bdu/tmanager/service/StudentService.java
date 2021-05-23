package com.bdu.tmanager.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Student;
import com.bdu.tmanager.dao.StudentDao;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;


    /**
     * 保存
     */
    public void add(Student student) {
        studentDao.save(student);
    }

    /**
     * 更新
     */
    public void update(Student student) {
        studentDao.save(student);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        studentDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Student findById(String id) {
        return studentDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
