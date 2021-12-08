package com.zhang;

import com.zhang.dao.UserMapper;
import com.zhang.pojo.User;
import com.zhang.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {
    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void test() {
        //第一步：获得SqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一：getMapper 执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSess
        sqlSession.close();
    }

    @Test
    public void Log4jTest() {
        logger.info("info:进入了Log4jTest");
        logger.debug("debug:进入了Log4jTest");
        logger.error("error:进入了Log4jTest");
    }

    @Test
    public void getUserByLimit() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> userByLimit = mapper.getUserByLimit(map);
        for (User user:userByLimit){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void  getUserByRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //RowBounds实现
        RowBounds rowBounds = new RowBounds(3,2);

        //通过java代码层面实现分页
        List<User> userList = sqlSession.selectList("com.zhang.dao.UserMapper.getUserByRowBounds",null,rowBounds);
        for(User user : userList){
            System.out.println(user);
        }
        sqlSession.close();
    }
}
