package com.zhang;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.zhang.mapper")
public class SpringBoot07MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot07MybatisApplication.class, args);
    }

}
