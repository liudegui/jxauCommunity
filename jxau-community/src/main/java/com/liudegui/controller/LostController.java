package com.liudegui.controller;

import com.liudegui.entity.Lost;
import com.liudegui.service.LostService;
import com.liudegui.utils.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LostController {

    @Autowired
    LostService lostService;

    @RequestMapping("lost")
    public String lost(){
        return "lost";
    }

    @RequestMapping(value = "/insertLost", method = RequestMethod.POST)
    public Map insertLost(HttpServletRequest request) {
        /*String studID = CookieUtil.getCookieValue(request, "username");
        String lostType = request.getParameter("lostType");
        String lostName = request.getParameter("lostName");
        String lostDesc = request.getParameter("lostDesc");
        String lostContact = request.getParameter("lostContact");
        String lostAddr = request.getParameter("lostAddr");*/
        //获取请求参数封装为Lost对象
        Lost lost = new Lost();
        lost.setStudID(CookieUtil.getCookieValue(request, "username"));
        lost.setLostType(request.getParameter("lostType"));
        lost.setLostName(request.getParameter("lostName"));
        lost.setLostDesc(request.getParameter("lostDesc"));
        lost.setLostContact(request.getParameter("lostContact"));
        lost.setLostAddr(request.getParameter("lostAddr"));

        lostService.comment(lost);
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("msg", "成功");
        map.put("data", "------");
        return map;
    }
}
