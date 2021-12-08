package com.zhang.service;

import com.zhang.entity.User;

public class UserService {
    //登录功能

    public User login(String name,String password){
        User user = null;
        UserDao userDao = new UserDao();
        user = userDao.login(name, password);
        return user;
    }
    //注册
    public boolean reg(User user){
        boolean f = false;
        //做简单判断
        //邮箱是否合法，要注册的用户名，密码是否符合

        return f;
    }
}
