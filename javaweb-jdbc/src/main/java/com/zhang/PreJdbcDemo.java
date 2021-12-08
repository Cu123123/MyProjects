package com.zhang;

import java.sql.*;

public class PreJdbcDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&" +
                "characterEncoding=utf-8&serverTimezone=GMT&useSSL=false";
        String user = "root";
        String password = "root";
        //加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //连接数据库，代表数据库
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into users(id,name,email,birthday) values(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,4);
        preparedStatement.setString(2,"zhangsan");
        preparedStatement.setString(3,"21@qq.com");
        preparedStatement.setDate(4,new Date(new java.util.Date().getTime()));
        //预编译
        int i = preparedStatement.executeUpdate();
        if(i>0){
            System.out.println("插入成功");
        }
        //释放资源
        preparedStatement.close();
        connection.close();
    }
}
