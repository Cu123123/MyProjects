//package com.zhang.admin.config;
//
//import com.zhang.admin.interceptor.LoginInterceptor;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//public class AdminWebConfig implements WebMvcConfigurer {
//
//    /*
//    * 访问/a/** 所有请求都去 classpath:/static/ 下面进行匹配
//    */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/a/**")
//                .addResourceLocations("classpath:/static/");
//    }
//
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new LoginInterceptor())
//                .addPathPatterns("/**")//所有请求都会被拦截，包括静态资源
//                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**");
//
//    }
//}
