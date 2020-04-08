package com.liudegui.service;

import com.liudegui.dao.IUserDao;
import com.liudegui.entity.User;
import com.liudegui.mapper.UserMapper;
import com.liudegui.model.UserModel;
import com.liudegui.utils.AssertUtil;
import com.liudegui.utils.Base64Util;
import com.liudegui.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    IUserDao userDao;
    public User findUser(String username,String password){
        return userDao.selUser(username,password);
    }
    public User catUser(String userId){
        return userDao.selUser1info(userId);
    }

    public UserModel userLogin(String username, String password) {
        User user = userDao.queryUserByName(username);
        AssertUtil.isTrue(null == user, "用户不存在");
        //userPwd = Md5Util.encode(userPwd);//对传过来的密码进行MD5加密，然后再与数据库的密码进行比较
        AssertUtil.isTrue(!password.equals(user.getStud_password()), "密码错误");
        return createUserModel(user);
    }

    public UserModel createUserModel(User user) {
        UserModel userModel = new UserModel();
        userModel.setUserName(user.getStud_name());
        //String userId = Base64Util.encode(user.getId());//加密之后的user的ID
        userModel.setUserId(user.getStud_id());
        return userModel;
    }
}
