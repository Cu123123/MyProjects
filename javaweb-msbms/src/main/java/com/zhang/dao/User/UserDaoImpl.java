package com.zhang.dao.User;

import com.zhang.dao.BaseDao;
import com.zhang.pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {
    public User getLoginUser(Connection connection, String userCode) throws SQLException {
        ResultSet rs = null;
        PreparedStatement pstm = null;
        User user = null;
        if (connection != null) {//重要 如果没有请求连接也进行sql的查询会出大问题
            //因为是用预编的方法所以参数用？
            String sql = "select * from smbms_user where userCode=?";
            //还需要给sql语句传parms参数
            Object[] params = {userCode};

            //这时候就可以调用BaseDao中的sql查询语句了
            //得到查询返回的结果集 进行遍历全部取出来
            rs = BaseDao.execute(connection, pstm,rs,sql, params);
            if (rs.next()){
                user = new User();//创建一个user 设置user中的值
                user.setId(rs.getInt("id"));
                user.setUserCode(rs.getString("userCode"));
                user.setUserName(rs.getString("userName"));
                user.setUserPassword(rs.getString("userPassword"));
                user.setGender(rs.getInt("gender"));
                user.setBirthday(rs.getDate("birthday"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setUserRole(rs.getInt("userRole"));
                user.setCreatedBy(rs.getInt("createdBy"));
                user.setCreationDate(rs.getDate("creationDate"));
                user.setModifyBy(rs.getInt("modifyBy"));
                user.setModifyDate(rs.getDate("modifyDate"));
            }
            //设置完成之后关闭资源
            BaseDao.closeResource(null,pstm,rs);
            //conn不关是因为这只是登录用户的dao 还可能继续使用sql
        }
        return user;
    }

    @Override
    public int updatePwd(Connection connection, int id, String password) {
        PreparedStatement pstm = null;
        int execute = 0;
        if(connection!=null){
            String sql = "update smbms_user set userpassword = ? where id = ?";
            Object params[] = {password,id};
            try {
                execute = BaseDao.executeUpdata(connection, pstm, sql, params);
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            BaseDao.closeResource(null,pstm,null);
        }

        return execute;
    }
}

