package com.bdu.tmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Dailyworktype;
import com.bdu.tmanager.dao.DailyworktypeDao;

import java.util.List;

@Service
public class DailyworktypeService {

    @Autowired
    private DailyworktypeDao dailyworktypeDao;


    /**
     * 保存
     */
    public void add(Dailyworktype dailyworktype) {
        //基本属性的设置
        String id = "";
        dailyworktype.setId(id);
        dailyworktypeDao.save(dailyworktype);
    }

    /**
     * 更新
     */
    public void update(Dailyworktype dailyworktype) {
        dailyworktypeDao.save(dailyworktype);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        dailyworktypeDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Dailyworktype findById(String id) {
        return dailyworktypeDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Dailyworktype> findAll() {
        return dailyworktypeDao.findAll();
    }
}
