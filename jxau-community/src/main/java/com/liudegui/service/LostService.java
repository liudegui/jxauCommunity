package com.liudegui.service;

import com.liudegui.dao.ILostDao;
import com.liudegui.entity.Lost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LostService {

    @Autowired
    ILostDao lostDao;
    public void comment(Lost lost) {
        //获取主键记录
        Integer post_id = lostDao.selLastNum();
        lost.setLostID(Integer.valueOf((post_id+1)));

        lostDao.insertLost(lost);
    }
}
