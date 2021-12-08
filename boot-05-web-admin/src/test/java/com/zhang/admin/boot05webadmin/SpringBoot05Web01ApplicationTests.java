package com.zhang.admin.boot05webadmin;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Slf4j
@SpringBootTest
class Boot05WebAdminApplicationTests {
    @Autowired(required = false)
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {

        Long aLong = jdbcTemplate.queryForObject("select count(*) from test", Long.class);
        log.info("查询数据的总条数{}",aLong);
        log.info("数据源类型：{}",dataSource.getClass());
    }

}
