package com.liy;

import com.liy.bean.User;
import com.liy.mapper.UserMapper;
import com.liy.mapper2.UserMapper2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {
    @Autowired
    UserMapper um;

    @Autowired
    UserMapper2 um2;
    @Test
    public void contextLoads() {
        List<User> user = um.selectAll();
        System.out.println(user);

        List<User> users = um2.selectAll();
        System.out.println(users);
    }

}
