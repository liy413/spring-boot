package com.liy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbcTemplateApplicationTests {
    @Resource(name = "one")
    JdbcTemplate dsOne;

    @Resource(name = "two")
    JdbcTemplate dsTwo;
    @Test
    public void contextLoads() {
        List<User> users = dsOne.query("select *from user", new BeanPropertyRowMapper<>(User.class));
        System.out.println(users);

        List<User> user = dsTwo.query("select *from users", new BeanPropertyRowMapper<>(User.class));
        System.out.println(user);

    }

}
