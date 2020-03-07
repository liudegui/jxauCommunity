package com.liudegui.controller;

import com.liudegui.entity.User;
import com.liudegui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login")
    public ModelAndView login(){
        ModelAndView model = new ModelAndView();
        model.addObject("wtUserList", "");
        model.addObject("enuList","liudegui");
        model.setViewName("/main.html");    //你要跳转html的名字
        return model;
    }

    @ResponseBody
    @RequestMapping("getUser/{stud_id}")
    public User GetUser(@PathVariable String stud_id){
        User user = userService.selectUserById(stud_id);
        System.out.println(user);
        return user;
    }
}
