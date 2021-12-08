package com.zhang.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class RequestController {

    @GetMapping("/goto")
    public String goToPage(HttpServletRequest request){
        request.setAttribute("msg","成功了");
        request.setAttribute("code",200);
        return "forward:/success";
    }

    @ResponseBody
    @GetMapping("/success")
    public Map getMess(HttpServletRequest request,
                       @RequestAttribute("msg") String msg,
                       @RequestAttribute("code") Integer code){
        Object msg1 = request.getAttribute("msg");

        HashMap<String, Object> map = new HashMap<>();
        map.put("anno_method",msg);
        map.put("req_method",msg1);
        return map;
    }
}
