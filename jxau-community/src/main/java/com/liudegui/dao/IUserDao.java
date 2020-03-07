package com.liudegui.dao;

import com.liudegui.entity.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
