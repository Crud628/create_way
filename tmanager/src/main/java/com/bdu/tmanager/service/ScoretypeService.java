package com.bdu.tmanager.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Scoretype;
import com.bdu.tmanager.dao.ScoretypeDao;

import java.util.List;

@Service
public class ScoretypeService {

    @Autowired
    private ScoretypeDao scoretypeDao;


    /**
     * 保存
     */
    public void add(Scoretype scoretype) {
        scoretypeDao.save(scoretype);
    }

    /**
     * 更新
     */
    public void update(Scoretype scoretype) {
        scoretypeDao.save(scoretype);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        scoretypeDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Scoretype findById(String id) {
        return scoretypeDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Scoretype> findAll() {
        return scoretypeDao.findAll();
    }
}
