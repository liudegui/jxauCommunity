package com.liudegui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DynamicController {
    @RequestMapping("/personalDynamic")
    public String personalDynamic(){
        return "personalDynamic";
    }
    @RequestMapping("/pulishPersonalDynamic")
    @ResponseBody
    public Map<String,Object> pulishPersonalDynamic(String name){
        System.out.println(name);
        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg","成功");
        map.put("data","------");
        return map;
    }

}
