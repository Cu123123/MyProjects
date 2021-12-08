package com.zhang.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration(proxyBeanMethods = false)
public class RestConfig {
    //自定义filter
    @Bean
    public HiddenHttpMethodFilter HiddenHttpMethodFilter() {
        HiddenHttpMethodFilter methodFilter = new HiddenHttpMethodFilter();
        methodFilter.setMethodParam("_m");
        return methodFilter;
    }
}