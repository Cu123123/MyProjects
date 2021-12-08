package com.zhang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @RequestMapping("/t")
    public String test(){
        System.out.println("interceptor执行了");
        return "ok";
    }
}
