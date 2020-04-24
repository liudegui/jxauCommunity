package com.liudegui.service;

import com.liudegui.dao.UpdatePwdDao;
import com.liudegui.utils.AssertUtil;
import com.liudegui.utils.CookieUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Service
public class UpadatePwdService {
    @Resource
    UpdatePwdDao updatePwdDao;

    public void updatePwd(HttpServletRequest request) {
        String oldPassword = request.getParameter("oldPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");
        String username = CookieUtil.getCookieValue(request, "username");
        //验证原密码是否正确
        String password=  updatePwdDao.selPassword(username);
        AssertUtil.isTrue(!oldPassword.equals(password),"原密码不正确");
        //验证新密码和原密码是否一样
        AssertUtil.isTrue(newPassword.equals(password),"密码未做改变");
        //验证新密码个确认密码是否一样
        AssertUtil.isTrue(!newPassword.equals(confirmPassword),"新密码和确认密码不相等");

        //修改密码
        updatePwdDao.updatePwd(newPassword,username);


    }
}
