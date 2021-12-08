package com.zhang.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;

public class UtilsJson {

    public static String getJson(Object object){
        return getJson(object,"yyyy-MM--dd : hh:mm:ss");
    }

    public static String getJson(Object object,String date){

        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat(date);
        mapper.setDateFormat(sdf);
        try {
            return mapper.writeValueAsString(object);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
