package com.bdu.tmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Classteacher;
import com.bdu.tmanager.dao.ClassteacherDao;

import java.util.List;

@Service
public class ClassteacherService {

    @Autowired
    private ClassteacherDao classteacherDao;


    /**
     * 保存
     */
    public void add(Classteacher classteacher) {
        //基本属性的设置
        classteacherDao.save(classteacher);
    }

    /**
     * 更新
     */
    public void update(Classteacher classteacher) {
        classteacherDao.save(classteacher);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        classteacherDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Classteacher findById(String id) {
        return classteacherDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Classteacher> findAll() {
        return classteacherDao.findAll();
    }
}
