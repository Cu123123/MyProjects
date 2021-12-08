package com.zhang.boot.controller;

import ch.qos.logback.core.db.DBHelper;
import com.zhang.boot.bean.Pet;
import com.zhang.boot.bean.User;
import com.zhang.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/*
* @SpringBootApplication:这是一个SpringBoot应用
*/

//@Component("com")
@SpringBootApplication(scanBasePackages = "com")
public class MainApplication {

    public static void main(String[] args) {

        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //查看容器里的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

        //从容器中获取组件
//        Pet tom1 = run.getBean("Tom", Pet.class);
//        Pet tom2 = run.getBean("Tom", Pet.class);
//        System.out.println("组件:" + (tom1==tom2));
//
//        MyConfig bean = run.getBean(MyConfig.class);
//        System.out.println(bean);
//
//        //如果@Configuration(proxyBeanMethods = true)代理对象调用方法，SpringBoot总会检查这个组件是否在容器中有，如果有就不会新创
//        //保持组件单实例
//        User user1 = bean.user01();
//        User user2 = bean.user01();
//        System.out.println(user1 == user2);
//
//        User user01 = run.getBean("user01", User.class);
//        Pet tom = run.getBean("Tom", Pet.class);
//
//        System.out.println("用户的宠物:"+(user01.getPet() == tom));
//
//        // 获取组件
//
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        System.out.println("======================================");
//        for (String s : beanNamesForType) {
//            System.out.println(s);
//        }
//
//        DBHelper bean1 = run.getBean(DBHelper.class);
//        System.out.println(bean1);

        boolean tom = run.containsBean("Tom");
        System.out.println("容器中是否有tom组件："+tom);

        boolean user01 = run.containsBean("user01");
        System.out.println("容器中是否有user01组件："+user01);
    }


}
