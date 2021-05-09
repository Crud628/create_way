package com.bdu.tmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Autothinfo;
import com.bdu.tmanager.dao.AutothinfoDao;

import java.util.List;

@Service
public class AutothinfoService {

    @Autowired
    private AutothinfoDao autothinfoDao;


    /**
     * 保存
     */
    public void add(Autothinfo autothinfo) {
        //基本属性的设置
        String id = "";
        autothinfo.setId(id);
        autothinfoDao.save(autothinfo);
    }

    /**
     * 更新
     */
    public void update(Autothinfo autothinfo) {
        autothinfoDao.save(autothinfo);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        autothinfoDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Autothinfo findById(String id) {
        return autothinfoDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Autothinfo> findAll() {
        return autothinfoDao.findAll();
    }
}
