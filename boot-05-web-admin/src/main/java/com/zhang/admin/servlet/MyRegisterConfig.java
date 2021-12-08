//package com.zhang.admin.servlet;
//
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//import java.util.Arrays;
//
////@EnableWebMvc
//@Configuration(proxyBeanMethods = false)
//public class MyRegisterConfig {
//
//    @Bean
//    public ServletRegistrationBean myServlet(){
//        MyServlet myServlet = new MyServlet();
//        return new ServletRegistrationBean(myServlet,"/my","/my2");
//    }
//
//    //@Bean
//    //public FilterRegistrationBean myFilter(){
//    //    MyFilter myFilter = new MyFilter();
//    //    FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(myFilter);
//    //    filterRegistrationBean.setUrlPatterns(Arrays.asList("/my","my2"));
//    //    return filterRegistrationBean;
//    //}
//
//    @Bean
//    public ServletListenerRegistrationBean myListener(){
//        MyServletContextListener myServletContextListener = new MyServletContextListener();
//        return new ServletListenerRegistrationBean(myServletContextListener);
//    }
//}
