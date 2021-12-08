package com.zhang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.zhang.Utils.UtilsJson;
import com.zhang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class jsonDemo2 {
    @RequestMapping("/j2")
    public String json1() throws JsonProcessingException {
        Date date = new Date();
        return UtilsJson.getJson(date);
    }
}
