package com.liudegui.dao;

import com.liudegui.entity.DynamicInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IResourcesDao {

    List<DynamicInfo> selAllResources();
}
