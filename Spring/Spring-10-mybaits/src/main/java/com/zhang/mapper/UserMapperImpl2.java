package com.zhang.mapper;

import com.zhang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl2 implements UserMapper{
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);

        return mapper.selectUser();
    }
}
