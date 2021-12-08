package com.zhang;

import com.zhang.dao.UserMapper;
import com.zhang.pojo.User;
import com.zhang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        for(User user:users){
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserByIdTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void addUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要应用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int 小李 = mapper.addUser(new User(6, "小李", "111"));
        sqlSession.close();
    }

}
