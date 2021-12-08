package com.zhang.service;

import com.zhang.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){

        userDao.reduceMoney();
        userDao.addMoney();
    }
}
