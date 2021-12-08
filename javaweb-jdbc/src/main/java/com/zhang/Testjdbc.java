package com.zhang;

import java.sql.*;

public class Testjdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //配置信息
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&" +
                     "characterEncoding=utf-8&serverTimezone=GMT&useSSL=false";
        String user = "root";
        String password = "root";
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //连接数据库，代表数据库
        Connection connection = DriverManager.getConnection(url, user, password);
        //向数据库发送SQL的对象statement：CRUD
        Statement statement = connection.createStatement();
        String sql = "select * from users";

//        String sql2 = "delete from users where id=3";
//        int i = statement.executeUpdate(sql2);

        //执行查询SQL，返回一个ResultSet:结果集
        ResultSet rs = statement.executeQuery(sql);
       while (rs.next()){
           System.out.println("id="+rs.getObject("id"));
           System.out.println("name="+rs.getObject("name"));
           System.out.println("email="+rs.getObject("email"));
           System.out.println("birthday="+rs.getObject("birthday"));
       }
       rs.close();
       statement.close();
       connection.close();
    }
}
