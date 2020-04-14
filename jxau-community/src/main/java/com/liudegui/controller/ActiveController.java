package com.liudegui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActiveController {

    @RequestMapping("/active")
    public String active(){
        return "active";
    }
}
