package com.zhang.admin.controller;

import com.zhang.admin.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping(value = {"/","/login"})
    public String loginPage(){

        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model){

        if(!(StringUtils.isEmpty(user.getUsername())) && "123".equals(user.getPassword())){
            session.setAttribute("loginUser",user);
            return "redirect:/main.html";
        }else {

            model.addAttribute("error","用户名或密码错误");
            return "login";
        }

    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session){

        //Object loginUser = session.getAttribute("loginUser");
        //if(loginUser==null){
        //    return "login";
        //}else {
        //    return "main";
        //}
        return "main";
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/sql")
    public String queryFromDb(){
        Long aLong = jdbcTemplate.queryForObject("select count(*) from test", Long.class);

        return aLong.toString();
    }
}
