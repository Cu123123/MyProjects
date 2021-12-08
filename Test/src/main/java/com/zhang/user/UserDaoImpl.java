package com.zhang.user;

import com.zhang.entity.User;
import com.zhang.utils.BaseDao;

import java.sql.Connection;

public class UserDaoImpl implements UserDao{
    @Override
    public User getLoginUser(Connection connection, String name, String password) {

        String sql = "select * from user where name = ? and password = ?";
        Object[] params = {name,password};
        BaseDao.execute(connection,)
        return null;
    }
}
