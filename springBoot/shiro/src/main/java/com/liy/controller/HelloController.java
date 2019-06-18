package com.liy.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @PostMapping("/doLogin")
    public void doLogin(String name ,String password){
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(name,password));
            System.out.println("登陆成功");
        }catch (AuthenticationException e){

            System.out.println("登陆失败");
        }

    }

    @GetMapping("/login")
    public String login(){
        return "please login";
    }

}
