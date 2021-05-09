package com.bdu.tmanager.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Scoreinfo;
import com.bdu.tmanager.dao.ScoreinfoDao;

import java.util.List;

@Service
public class ScoreinfoService {

    @Autowired
    private ScoreinfoDao scoreinfoDao;


    /**
     * 保存
     */
    public void add(Scoreinfo scoreinfo) {
        //基本属性的设置
        String id = "";
        scoreinfo.setId(id);
        scoreinfoDao.save(scoreinfo);
    }

    /**
     * 更新
     */
    public void update(Scoreinfo scoreinfo) {
        scoreinfoDao.save(scoreinfo);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        scoreinfoDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Scoreinfo findById(String id) {
        return scoreinfoDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Scoreinfo> findAll() {
        return scoreinfoDao.findAll();
    }
}
