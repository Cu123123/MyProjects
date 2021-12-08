package com.zhang.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTEst {

    @RequestMapping("/hi")
    public String test(){

        return "你好！";
    }
}
