package com.liudegui.controller;

import com.liudegui.base.Constant;
import com.liudegui.base.exceptions.ParamsException;
import com.liudegui.entity.User;
import com.liudegui.model.MessageModel;
import com.liudegui.model.UserModel;
import com.liudegui.service.UserService;
import com.liudegui.utils.CookieUtil;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.Map;

@Controller
//@RequestMapping("")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public MessageModel userLogin(String username, String password){
        MessageModel messageModel=new MessageModel();
        //操作数据库
        try{
            UserModel userModel=userService.userLogin(username,password);
            messageModel.setResult(userModel);
        }catch (ParamsException e){
            e.printStackTrace();
            messageModel.setCode(Constant.LOGIN_FAILED_DODE);
            messageModel.setMsg(e.getMsg());
        }catch (Exception e){
            e.printStackTrace();
            messageModel.setCode(Constant.OPS_FAILED_DODE);
            messageModel.setMsg(Constant.OPS_FAILED_MSG);
        }
        return messageModel;
    }

    @RequestMapping("main")
    public String main(HttpServletRequest request,HttpSession session) throws
            UnsupportedEncodingException {
/**
 * 从request中，获取cookie 得到userName,和trueName
 */
        request.setAttribute("username", CookieUtil.getCookieValue(request,"username"));

        session.setAttribute("username",CookieUtil.getCookieValue(request,"username"));
        return "main";
    }

    @RequestMapping("/userInfo")
    public String catInfo(Model model,Map<String,Object> map,HttpSession session){
        User userInfo = userService.catUser("liudegui");
        map.put("person",userInfo);
        map.put("status","200");
        map.put("result","success");
        model.addAttribute("info",userInfo);
        session.setAttribute("user", userInfo.getStud_name());
        return "person";
    }

}
