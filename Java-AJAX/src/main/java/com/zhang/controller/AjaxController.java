package com.zhang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/ajax")
public class AjaxController {
    //第一种方式，服务器要返回一个字符串，直接使用response
    @RequestMapping("/a1")
    public void ajax(String name, HttpServletResponse response) {
        if ("admin".equals(name)) {
            try {
                response.getWriter().print("true");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                response.getWriter().print("false");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
@RequestMapping("/a2")
@ResponseBody
    public List<User> ajax2() {
        List<User> list = new ArrayList<User>();
        User user1 = new User("001", 18);
        User user2 = new User("002", 18);
        list.add(user1);
        list.add(user2);
        return list;//由于加了@ResponseBody注解，他会返回一个字符串
    }
    @RequestMapping("/a2")
    @ResponseBody
    public String ajax3(String name,String pwd) {
       String msg = "";
       if(name!=null){
           if("admin".equals(name)){
               msg = "ok";
           }else {
               msg = "用户名有误";
           }
       }
       if(pwd!=null){
           if("123".equals(pwd)){
               msg = "ok";
           }else {
               msg = "密码输入有误";
           }
       }
       return msg;
    }
}

