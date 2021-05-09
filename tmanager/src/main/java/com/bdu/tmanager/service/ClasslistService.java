package com.bdu.tmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Classlist;
import com.bdu.tmanager.dao.ClasslistDao;

import java.util.List;

@Service
public class ClasslistService {

    @Autowired
    private ClasslistDao classlistDao;


    /**
     * 保存
     */
    public void add(Classlist classlist) {
        //基本属性的设置
        String id = "";
        classlist.setId(id);
        classlistDao.save(classlist);
    }

    /**
     * 更新
     */
    public void update(Classlist classlist) {
        classlistDao.save(classlist);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        classlistDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Classlist findById(String id) {
        return classlistDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Classlist> findAll() {
        return classlistDao.findAll();
    }
}
