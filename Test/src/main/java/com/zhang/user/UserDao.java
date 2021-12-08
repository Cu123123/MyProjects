package com.zhang.user;

import com.zhang.entity.User;

import java.sql.Connection;

public interface UserDao {
    //得到要登录的用户
    public User getLoginUser(Connection connection,String name, String password) ;
}
