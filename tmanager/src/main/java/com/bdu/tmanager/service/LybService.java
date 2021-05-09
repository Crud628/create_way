package com.bdu.tmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Lyb;
import com.bdu.tmanager.dao.LybDao;

import java.util.List;

@Service
public class LybService {

    @Autowired
    private LybDao lybDao;



    /**
     * 保存
     */
    public void add(Lyb lyb) {
        //基本属性的设置
        Integer id = 1;
        lyb.setLno(id);
        lybDao.save(lyb);
    }

    /**
     * 更新
     */
    public void update(Lyb lyb) {
        lybDao.save(lyb);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        lybDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Lyb findById(String id) {
        return lybDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Lyb> findAll() {
        return lybDao.findAll();
    }
}
