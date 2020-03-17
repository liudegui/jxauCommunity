package com.liudegui.controller;

import com.liudegui.entity.User;
import com.liudegui.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
//@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;

    //@ResponseBody
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        User loginUser = userService.findUser(username,password);
        if (loginUser !=null) {
            //登陆成功，防止表单重复提交，可以重定向到主页
            session.setAttribute("user", loginUser.getStud_name());
            System.out.println(loginUser);
            return "main";
        } else {
            //登陆失败
            map.put("msg", "用户名密码错误");
            return "login";
        }


//    @ResponseBody
//    @RequestMapping("getUser/{stud_id}")
//    public User GetUser(@PathVariable String stud_id){
//        User user = userService.selectUserById(stud_id);
//        System.out.println(user);
//        return user;
//    }
    }

    @RequestMapping("/userInfo")
    public String catInfo(Model model,Map<String,Object> map){
        User userInfo = userService.catUser("liudegui");
        map.put("person",userInfo);
        map.put("status","200");
        map.put("result","success");
        model.addAttribute("info",userInfo);
        return "person";
    }

}
