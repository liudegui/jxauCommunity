package com.liudegui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LostController {

    @RequestMapping("/lost")
    public String lost(){
        return "lost";
    }
}
