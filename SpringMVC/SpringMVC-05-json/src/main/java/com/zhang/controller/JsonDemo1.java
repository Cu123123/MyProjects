package com.zhang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zhang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//@Controller
@RestController
public class JsonDemo1 {
    //@ResponseBody
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        //List<User> list = new ArrayList<User>() ;

            //User user1 = new User("张", 18, "男");
            //User user2 = new User("张", 18, "男");
            //list.add(user1);
            //list.add(user2);
            ObjectMapper mapper = new ObjectMapper();
            //String s = mapper.writeValueAsString(list);

        Date date = new Date();
        //ObjectMapper,时间解析后的默认格式为：Timestamp，时间戳
        String s = mapper.writeValueAsString(date);
        //return new ObjectMapper().writeValueAsString(list);
        return s;
        }

    }
