package com.liudegui.mapper;


import com.liudegui.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectUserById(String stud_id);
}
