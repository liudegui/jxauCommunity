package com.liudegui.service;

import com.liudegui.dao.IUserDao;
import com.liudegui.entity.User;
import com.liudegui.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserDao userDao;
    public User findUser(String username,String password){
        return userDao.selUser(username,password);
    }
    public User catUser(String userId){
        return userDao.selUser1info(userId);
    }
}
