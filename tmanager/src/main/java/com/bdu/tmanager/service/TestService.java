package com.bdu.tmanager.service;

import com.bdu.tmanager.bean.Test;
import com.bdu.tmanager.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author lan
 * @date 2021/4/21 - 22:01
 */
@Service
public class TestService {
    @Autowired
    private TestDao testDao;

    public boolean testSave(Test t){
        Test test = testDao.save(t);
        if (test!=null){
            return true;
        }
        return false;
    }

    public List<Test> testList(){
        List<Test> list = testDao.findAll();
        return list;
    }

    public Test testOne(String id){
        Test test = testDao.findById(id).get();
        return test;
    }
}
