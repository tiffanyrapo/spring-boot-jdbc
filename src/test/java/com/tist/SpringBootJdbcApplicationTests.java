package com.tist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootJdbcApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Test
    public void contextLoads() {
        List<Map<String, Object>> list =jdbcTemplate.queryForList("SELECT * FROM MOCK_DATA_CITY");
        System.err.println(list.size());
    }

}

