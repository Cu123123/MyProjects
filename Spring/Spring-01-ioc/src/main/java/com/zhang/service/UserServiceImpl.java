package com.zhang.service;

import com.zhang.dao.UserDao;
import com.zhang.dao.UserDaoImpl;
import com.zhang.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {

    private UserDao userDao ;


    //利用set进行动态实现值的注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    public void getUser() {
        userDao.getUser();
    }
}
