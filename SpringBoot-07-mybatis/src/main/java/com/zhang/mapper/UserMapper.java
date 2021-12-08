package com.zhang.mapper;

import com.zhang.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper  //这个注解表示了这是一个mybatis的mapper类
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(int id);

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);
}
