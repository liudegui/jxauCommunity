package com.liudegui.controller;

import com.liudegui.base.Constant;
import com.liudegui.base.exceptions.ParamsException;
import com.liudegui.model.MessageModel;
import com.liudegui.service.UpadatePwdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UpdatePasswordController {
    @Resource
    UpadatePwdService upadatePwdService;

    @RequestMapping("/updatePassword")
    public String updatePassword(){
        return "updatePwd";
    }

    @ResponseBody
    @RequestMapping("/updatePwd")
    public MessageModel updatePwd(HttpServletRequest request){
        MessageModel messageModel=new MessageModel();
        //操作数据库
        try{
            upadatePwdService.updatePwd(request);
            messageModel.setMsg("密码修改成功");
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
}
