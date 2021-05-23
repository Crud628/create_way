package com.bdu.tmanager.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
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
    public void deleteById(Integer id) {
        scoreinfoDao.deleteById(id);
    }

    /**
     * 根据id查询
     */
    public Scoreinfo findById(Integer id) {
        return scoreinfoDao.findById(id).get();
    }

    /**
     * 查询列表
     */
    public List<Scoreinfo> findAll() {
        return scoreinfoDao.findAll();
    }

	public Page<Scoreinfo> findAll(Integer page) {
		Page<Scoreinfo> findAll = scoreinfoDao.findAll(PageRequest.of(page-1, 5));;
		return findAll;
	}
}
