package com.zhang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class SecurityConfig extends WebSecurityConfigurerAdapter {
    //授权
    @Bean
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //授权
        //首页所有人都能访问，功能页只有对应有权限的人才能访问
        http.authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/level1/**").hasRole("vip1")
                .antMatchers("/level2/**").hasRole("vip2")
                .antMatchers("level3/**").hasRole("vip3");

        //没有权限会默认到登录页

        http.formLogin();
    }

    //认证
    @Bean
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder())
                .withUser("zhang").password(new BCryptPasswordEncoder().encode("123")).roles("vip1","vip2")
                .and()
                .withUser("admin").password(new BCryptPasswordEncoder().encode("root")).roles("vip1","vip2","vip3");
    }
}
