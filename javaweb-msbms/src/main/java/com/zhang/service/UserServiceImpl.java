package com.zhang.service;

import com.zhang.dao.BaseDao;
import com.zhang.dao.User.UserDao;
import com.zhang.dao.User.UserDaoImpl;
import com.zhang.pojo.User;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;


public class UserServiceImpl implements UserService {
    //业务层都会调取Dao层，所以我们要引入Dao层
    private UserDao userDao;//私有化UserDao的对象
    public UserServiceImpl(){
        userDao = new UserDaoImpl();
        //通过无参构造方法将userDao实例化 然后就可以使用userDao方法了
    }
    public User login(String userCode, String password) {
        Connection connection=null;//提升作用域
        User user = null;//最后要返回User对象

        try {
            connection = BaseDao.getConnection();//获取sql连接、
            //通过业务层调用对应的具体数据库操作
            user = userDao.getLoginUser(connection,userCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connection,null,null);
        }
        return  user;//调用这个方法就可以查到用户
    }

    @Override
    public boolean updatePwd(int id, String pwd) {
        Connection connection = null;
        boolean flag = false;
        //修改密码
        try {
            connection = BaseDao.getConnection();
            if(userDao.updatePwd(connection,id,pwd)>0){
                flag = true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            BaseDao.closeResource(connection,null,null);
        }
        return flag;
    }


    //测试一下功能
    @Test
    public void test(){
    //调用login方法
        UserServiceImpl service = new UserServiceImpl();
        User admin = service.login("admin","123");
        System.out.println(admin.getUserPassword());
    }
}

