package com.zhang.boot.controller;

import org.springframework.boot.autoconfigure.web.reactive.WebFluxProperties;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParamTestController {

    @GetMapping("/car/{id}/owner/{username}")
    public Map<String, Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable Map<String,String> pv,
                                      //@RequestHeader("User-Agent") String usrAgent,
                                      //@RequestHeader Map<String,String> header,
                                      @RequestParam("age") Integer age,
                                      @RequestParam("interests") List<String> interests,
                                      @RequestParam Map<String,String> params,
                                      @CookieValue("Idea-7b916011") String Idea_7b916011,
                                      @CookieValue("Idea-7b916011") Cookie cookie)
                                      {

        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
        //map.put("User-Agent",usrAgent);
        //map.put("headers",header);
        map.put("age",age);
        map.put("interests",interests);
        map.put("params",params);
        map.put("Idea-7b916011", Idea_7b916011);
        //map.put("cookie",cookie);
        System.out.println(cookie);
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("content", content);
        return map;
    }

    @ResponseBody
    @RequestMapping("/cars/{path}")
    public Map carsSell(@MatrixVariable("low") Integer low,
                        @MatrixVariable("brand") List<String> brand,
                        @PathVariable("path") String path){
        HashMap<String, Object> map = new HashMap<>();
        map.put("low",low);
        map.put("brand",brand);
        map.put("path",path);
        return map;
    }

    @ResponseBody
    @RequestMapping("/boss/{bossId}/{empId}")
    public Map bossEmp(@MatrixVariable(value = "age",pathVar = "bossId") Integer bossAge,
                      @MatrixVariable(value = "age",pathVar = "empId") Integer empAge){
        HashMap<String, Object> map = new HashMap<>();
        map.put("bossAge",bossAge);
        map.put("empAge",empAge);
        return map;

    }
}
