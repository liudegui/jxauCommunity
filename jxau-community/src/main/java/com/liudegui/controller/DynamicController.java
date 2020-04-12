package com.liudegui.controller;

import com.liudegui.service.DynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DynamicController {

    @Autowired
    private DynamicService dynamicService;

    @RequestMapping("/personalDynamic")
    public String personalDynamic() {
        return "personalDynamic";
    }

    @RequestMapping("/pulishPersonalDynamic")
    @ResponseBody
    public Map<String, Object> pulishPersonalDynamic(String content,HttpServletRequest request) {
        dynamicService.publish(content,request);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", "------");
        return map;
    }
    @RequestMapping("/communityDynamic")
    public String communityDynamic() {
        return "communityDynamic";
    }

}
