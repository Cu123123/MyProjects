package com.zhang.controlelr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class JdbcController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    //查询数据库的所有信息
    @GetMapping("/userList")
    public List<Map<String,Object>> userList(){
        String sql = "select * from user";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        return maps;
    }

    @GetMapping("/addUser")
    public String addUser(){
        String sql = "insert into user() values(4,'赵四','123','沈阳',0)";
        jdbcTemplate.update(sql);
        return "update-ok";
    }

    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable("id") int id){
        String sql = "update user set name=?, password=?,address=?,flag=? where id="+id;
        Object[] objects = new Object[4];
        objects[0] = "小明";
        objects[1] = "123123";
        objects[2] = "北京";
        objects[3] = 1;
        jdbcTemplate.update(sql,objects);
        return "update-ok";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable("id") int id){
        String sql = "delete from user where id = ?";
        jdbcTemplate.update(sql,id);
        return "delete-ok";
    }
}
