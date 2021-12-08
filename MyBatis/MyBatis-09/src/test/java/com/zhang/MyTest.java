package com.zhang;

import com.zhang.dao.UserMapper;
import com.zhang.pojo.User;
import com.zhang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void queryUserTest(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);
        User user1 = mapper1.queryUser(1);
        System.out.println(user1);
        sqlSession1.close();



        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.queryUser(1);
        System.out.println(user2);
        sqlSession2.close();

        System.out.println(user1==user2);
    }
}
