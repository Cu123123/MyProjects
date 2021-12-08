package com.zhang.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;

@Configuration
public class DruidConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setFilters("stat");

        return druidDataSource;
    }

    //后台监控功能
    @Bean
    public ServletRegistrationBean StatViewServlet(){
        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

        //后台需要有人登录
        HashMap<String, String> initParameters = new HashMap<>();
        initParameters.put("loginUsername","admin");//登录key是固定的
        initParameters.put("loginPassword","123456");

        //允许谁可以访问
     //   initParameters.put("allow","");//所有人都可以访问
     //   initParameters.put("allow","localhost");//本机可以访问

        //禁止谁访问
       // initParameters.put("zhang","192.168.11.123");

        bean.setInitParameters(initParameters);//设置初始化参数
        return bean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        //可以过滤请求
        HashMap<String, String> initParameters = new HashMap<>();
        //这些不进行统计
        initParameters.put("exclusions","*.js,6.css,/druid/*");
        bean.setInitParameters(initParameters);
        return bean;
    }
}
