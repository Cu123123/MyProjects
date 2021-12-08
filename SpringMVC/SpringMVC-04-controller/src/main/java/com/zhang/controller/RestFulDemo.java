package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulDemo {

    @RequestMapping("/test/{a}/{b}")
    public String test(@PathVariable int a, @PathVariable int b , Model model){
        int res = a+b;
        model.addAttribute("msg","结果为："+res);
        return "test";
    }


    @RequestMapping(value = "/user10",method = RequestMethod.PUT)
    public String test2(){

        return "test3";
    }
}
