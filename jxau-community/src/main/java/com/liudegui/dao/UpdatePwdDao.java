package com.liudegui.dao;

public interface UpdatePwdDao {
    String selPassword(String username);

    void updatePwd(String newPassword,String username);
}
