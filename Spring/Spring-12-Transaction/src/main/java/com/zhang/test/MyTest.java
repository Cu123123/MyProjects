package com.zhang.test;

import com.zhang.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    @Test
    public void testAccount(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserService UserService = context.getBean("UserService", UserService.class);

    }
}
