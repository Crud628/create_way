package com.bdu.tmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Rzgl;
import com.bdu.tmanager.dao.RzglDao;

import java.util.List;

@Service
public class RzglService {

    @Autowired
    private RzglDao rzglDao;


    /**
     * 保存
     */
    public void add(Rzgl rzgl) {
        //基本属性的设置
        rzglDao.save(rzgl);
    }

    /**
     * 更新
     */
    public void update(Rzgl rzgl) {
        rzglDao.save(rzgl);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        rzglDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Rzgl findById(String id) {
        return rzglDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Rzgl> findAll() {
        return rzglDao.findAll();
    }
}
