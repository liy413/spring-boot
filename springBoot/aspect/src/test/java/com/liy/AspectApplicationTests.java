package com.liy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectApplicationTests {
    @Autowired
    HelloController hc;

    @Test
    public void contextLoads() {

        hc.hello();
    }

}
