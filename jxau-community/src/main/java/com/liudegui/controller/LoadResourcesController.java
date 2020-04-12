package com.liudegui.controller;

import com.liudegui.entity.DynamicInfo;
import com.liudegui.service.ResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class LoadResourcesController {

    @Autowired
    ResourcesService resourcesService;

    @RequestMapping("/loadResources")
    @ResponseBody
    public Map<String,Object> loadResources(){
        List<DynamicInfo> dynamicInfos = resourcesService.selAllInfo();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", dynamicInfos);
        return map;
    }

    @RequestMapping("/loadPersonalResources")
    @ResponseBody
    public Map<String,Object> loadPersonalResources(){
        List<DynamicInfo> dynamicInfos = resourcesService.selAllPersonalInfo();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", dynamicInfos);
        return map;
    }

    @RequestMapping("/loadCommunityResources")
    @ResponseBody
    public Map<String,Object> loadCommunityResources(){
        List<DynamicInfo> dynamicInfos = resourcesService.selAllCommunityInfo();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", dynamicInfos);
        return map;
    }
}
