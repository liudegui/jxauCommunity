package com.liudegui.service;

import com.liudegui.dao.IResourcesDao;
import com.liudegui.entity.DynamicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourcesService {

    @Autowired
    IResourcesDao resourcesDao;

    public List<DynamicInfo> selAllInfo() {

        DynamicInfo dynamicInfo = new DynamicInfo();

        resourcesDao.selAllResources();


        return null;
    }
}
