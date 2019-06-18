package com.liy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExController {

    @GetMapping("/hello")
    public String hello(){
        int i = 1/0;
        return "hello";
    }
}
