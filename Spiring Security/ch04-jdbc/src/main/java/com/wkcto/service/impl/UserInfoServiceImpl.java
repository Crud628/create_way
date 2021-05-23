package com.wkcto.service.impl;

import com.wkcto.dao.UserInfoDao;
import com.wkcto.entity.UserInfo;
import com.wkcto.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao dao;
    @Override
    public UserInfo findUserInfo(String username) {
        UserInfo userinfo = dao.findByUsername(username);
        return userinfo;
    }
}
