package com.zhang.service;

import com.zhang.pojo.User;

public interface UserService {
    //用户登录
    public User login(String userCode, String password);
    public boolean updatePwd(int id , String pwd);
}