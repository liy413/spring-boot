package com.liy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import javax.xml.transform.Source;
import java.util.List;

public class MyApplicationRunner1 implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> nonOptionArgs = args.getNonOptionArgs();
        System.out.println(nonOptionArgs);

    }
}
