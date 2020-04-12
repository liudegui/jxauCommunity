package com.liudegui.dao;

import com.liudegui.entity.Lost;
import org.springframework.stereotype.Repository;

@Repository
public interface ILostDao {
    void insertLost(Lost lost);
    Integer selLastNum();
}
