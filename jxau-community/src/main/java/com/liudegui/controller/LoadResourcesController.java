package com.liudegui.controller;

import com.liudegui.entity.DynamicInfo;
import com.liudegui.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


@Controller
public class LoadResourcesController {

    @Autowired
    ResourcesService resourcesService;

    @RequestMapping("/loadResources")
    @ResponseBody
    public List loadResources(){

        List<DynamicInfo> dynamicInfos = resourcesService.selAllInfo();
        return dynamicInfos;

    }
}
