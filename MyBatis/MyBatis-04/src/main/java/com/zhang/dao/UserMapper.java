package com.zhang.dao;

import com.zhang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();

    //分页
    List<User> getUserByLimit(Map<String,Integer> map);

    List<User> getUserByRowBounds(Map<String,Integer> map);

}
