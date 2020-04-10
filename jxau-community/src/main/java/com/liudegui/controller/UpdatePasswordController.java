package com.liudegui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdatePasswordController {
    @RequestMapping("/updatePassword")
    public String updatePassword(){
        return "updatePwd";
    }
}
