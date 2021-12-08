package com.zhang.dao;

import com.zhang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    //查询用户
    User queryUser(@Param("id") int id);

    //修改用户
    int UpdateUser(User user);
}
