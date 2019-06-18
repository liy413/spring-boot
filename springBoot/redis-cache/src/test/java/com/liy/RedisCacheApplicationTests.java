package com.liy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCacheApplicationTests {
    @Autowired
    HelloService hs;
    @Test
    public void contextLoads() {

        User user = hs.hello(1);
        //hs.update(1);
      //  hs.delete(1);
        user = hs.hello(1);
        //System.out.println(">>>"+user);

    }

}
