package com.liudegui.dao;

import com.liudegui.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {
    User selUser(String username,String password);
    User selUser1info(String userId);
    User queryUserByName(String username);
}
