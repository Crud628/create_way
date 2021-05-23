package com.bdu.tmanager.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.stereotype.Service;

import com.bdu.tmanager.bean.Dailyworkinfo;
import com.bdu.tmanager.bean.PageResult;
import com.bdu.tmanager.dao.DailyworkinfoDao;

@Service
public class DailyworkinfoService {

    @Autowired
    private DailyworkinfoDao dailyworkinfoDao;


    /**
     * 保存
     */
    public void add(Dailyworkinfo dailyworkinfo) {
        dailyworkinfoDao.save(dailyworkinfo);
    }

    /**
     * 更新
     */
    public void update(Dailyworkinfo dailyworkinfo) {
        dailyworkinfoDao.save(dailyworkinfo);
    }

    /**
     * 删除
     */
    public void deleteById(String id) {
        dailyworkinfoDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Dailyworkinfo findById(String id) {
        return dailyworkinfoDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Dailyworkinfo> findAll() {
        return dailyworkinfoDao.findAll();
    }
    
    public Page<Dailyworkinfo> findAll(Integer page){
    	Page<Dailyworkinfo> findAll = dailyworkinfoDao.findAll(PageRequest.of(page-1,5));
    	return findAll;
    }
}
