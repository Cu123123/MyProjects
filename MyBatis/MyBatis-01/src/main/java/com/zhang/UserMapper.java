package com.zhang;

import com.zhang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //查询所有用户
    List<User> getUserList();
    //根据id查询用户
    User getUserById(int id);
    //添加用户
    int addUser(User user);
    //更改用户信息
    int updateUser(User user);
    //删除用户
    int deleteUser(int id);
    //万能Map
    int addUser2(Map<String,Object> map);

    List<User> getUserLike(String value);
}
