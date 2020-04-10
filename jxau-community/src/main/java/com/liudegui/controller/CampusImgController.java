package com.liudegui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CampusImgController {

    @RequestMapping("/xyfg")
    public String campusImg(){
        return "xyfg";
    }
}
