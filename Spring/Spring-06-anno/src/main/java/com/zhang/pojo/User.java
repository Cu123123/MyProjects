package com.zhang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component组件，相当于<bean id="user" class="com.zhang.pojo.User"/>
@Scope("prototype")
@Component
public class User {
    //  @Value("zhang") 相当于： <property name="name" value="song"/>
    @Value("zhang")
    public String name;

}
