package com.zhang.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
/*
*只有在容器中的组件，才会拥有SpringBoot提供的强大功能
*
* */
//@Component
@ConfigurationProperties(prefix = "mycar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String brand;
    private int price;


}
