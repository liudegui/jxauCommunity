package com.liudegui.service;

import com.liudegui.entity.User;
import com.liudegui.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User selectUserById(String stud_id){
        return userMapper.selectUserById(stud_id);
    }
}
