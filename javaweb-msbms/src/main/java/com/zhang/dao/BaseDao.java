package com.zhang.dao;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class BaseDao {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        Properties pro = new Properties();
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("db.properties");

        try {
            pro.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = pro.getProperty("driver");
        url = pro.getProperty("url");
        user = pro.getProperty("user");
        password = pro.getProperty("password");
    }

    //连接数据库的方法
    public static Connection getConnection() {
        Connection connection = null;
        try {
            //用Class.forName()注册驱动
            Class.forName(driver);
            //用DriverManager.getConnection连接数据库
            connection = DriverManager.getConnection(url, user, password);
            //此时连接操作已经完成 我们需要返回这个Connection对象 但是他被try catch包住了
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;//提升connection的作用域之后就可以return了
    }


    //1.重写查询操作方法
    public static ResultSet execute(Connection connection,PreparedStatement preparedStatement, ResultSet resultSet,String sql, Object[] params ) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {//预编译
            //for循环从0写但是setObject中的第一个参数是从1开始的 所以用+1
            preparedStatement.setObject(i + 1, params[i]);
        }
        //执行sql语句，预编译过了所以直接执行
        resultSet = preparedStatement.executeQuery();
        //返回executeQuery
        return resultSet;
        //将rs 和 preparedStatement提升作用域是为了之后的关闭资源方便
    }

    //编写增删改公共方法
    public static int executeUpdata(Connection connection,PreparedStatement preparedStatement, String sql, Object[] params ) throws SQLException {
        preparedStatement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {//预编译
            //for循环从0写但是setObject中的第一个参数是从1开始的 所以用+1
            preparedStatement.setObject(i + 1, params[i]);
        }
        //执行sql语句,预编译过了所以直接执行
        int updateRows = preparedStatement.executeUpdate();
        //返回executeQuery
        return updateRows;
        //将rs 和 preparedStatement提升作用域是为了之后的关闭资源方便
    }

    public static boolean closeResource(Connection connection, PreparedStatement preparedStatement, ResultSet rs) {
        boolean flag = true;
        if (rs != null) {
            try {//关闭成功
                rs.close();
                //GC回收
                rs = null;
            } catch (SQLException e) {
                e.printStackTrace();
                //关闭出错
                flag = false;
            }
        }
        if (connection != null) {
            try {//关闭成功
                connection.close();
                //GC回收
                connection = null;
            } catch (SQLException e) {
                e.printStackTrace();
                //关闭出错
                flag = false;
            }
        }
        if (preparedStatement != null) {
            try {//关闭成功
                preparedStatement.close();
                //GC回收
                preparedStatement = null;
            } catch (SQLException e) {
                e.printStackTrace();
                //关闭出错
                flag = false;
            }
        }
        return flag;
    }
}
