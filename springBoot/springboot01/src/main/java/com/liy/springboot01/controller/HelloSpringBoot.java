package com.liy.springboot01.controller;

import com.liy.springboot01.bean.Book;
import com.liy.springboot01.bean.User;
import com.liy.springboot01.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @Autowired
    HelloService hs;
    @Autowired
    Book book;
    @Autowired
    User user;

    @GetMapping("/hello")
    public Book hello() {

        return book;
    }

    @GetMapping("/user")
    public User user() {

        return user;
    }
}
