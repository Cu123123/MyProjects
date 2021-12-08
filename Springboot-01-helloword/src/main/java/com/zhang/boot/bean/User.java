package com.zhang.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Data
//@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class User {
    private String name;
    private Integer age;
    private Pet pet;

    public User(String name,Integer age){
        this.name = name;
        this.age = age;
    }


}
