package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        System.out.println("login"+username);
        session.setAttribute("userLoginInfo",username);
        return "main";
    }
    @RequestMapping("/goLogin")
    public String login(){

        return "login";
    }
    @RequestMapping("/main")
    public String main(){

        return "main";
    }

    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "login";
    }
}
