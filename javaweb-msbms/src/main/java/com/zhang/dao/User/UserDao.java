package com.zhang.dao.User;

import com.zhang.pojo.User;

import java.sql.Connection;
import java.sql.SQLException;

public interface UserDao {
    //得到要登录用户
    public User getLoginUser(Connection connection, String userCode) throws SQLException;
    public int updatePwd(Connection connection,int id ,String password) throws SQLException;
}
