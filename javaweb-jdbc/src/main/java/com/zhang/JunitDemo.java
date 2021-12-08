package com.zhang;

import org.junit.Test;

import java.sql.*;

public class JunitDemo {
    @Test
    public void test() {
        String url = "jdbc:mysql://localhost:3306/jdbc?useUnicode=true&" +
                "characterEncoding=utf-8&serverTimezone=GMT&useSSL=false";
        String user = "root";
        String password = "root";
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //连接数据库，代表数据库
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            String sql = "update count set money=money-100 where id=1";
            int i1 = connection.prepareStatement(sql).executeUpdate();

            String sql2 = "update count set money=money+100 where id=2";
            int i2 = connection.prepareStatement(sql2).executeUpdate();
            int i = 1 / 0;

            System.out.println("提交成功");
            //释放资源
        } catch (Exception e) {
            try {
                connection.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
