package com.liy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.liy")
public class SpringBootServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootServletApplication.class, args);
    }

}
