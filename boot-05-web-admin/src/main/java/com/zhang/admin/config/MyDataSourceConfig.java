package com.zhang.admin.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.SQLException;

public class MyDataSourceConfig {

    @ConfigurationProperties("spring.datasource")
    @Bean
    public DataSource dataSource() throws SQLException {

        DruidDataSource druidDataSource = new DruidDataSource();

        //加入监控功能
        druidDataSource.setFilters("stat");
        return druidDataSource;
    }

    /*
        配置druid的监控页功能

    */
    @Bean
    public ServletRegistrationBean statViewServlet(){

        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> statViewServletServletRegistrationBean = new ServletRegistrationBean<>(statViewServlet, "/druid/*");

        return statViewServletServletRegistrationBean;
    }
}
