package com.zhang;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import com.zhang.dao.UserMapper;
import com.zhang.pojo.User;
import com.zhang.utils.MybatisUtils;

import java.util.List;

public class UserDaoTest {


    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);
        sqlSession.close();
    }

}
