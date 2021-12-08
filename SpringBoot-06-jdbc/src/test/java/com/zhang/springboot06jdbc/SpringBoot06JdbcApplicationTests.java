package com.zhang.springboot06jdbc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
@SpringBootTest
class SpringBoot06JdbcApplicationTests {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {

        Long along = jdbcTemplate.queryForObject("select count(*) from user",Long.class);
        log.info("记录总数：{}",along);
        System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

}
