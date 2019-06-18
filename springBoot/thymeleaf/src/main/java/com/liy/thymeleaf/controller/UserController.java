package com.liy.thymeleaf.controller;

import com.liy.thymeleaf.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/user")
    public String lists(Model m){
        List<User> users = new ArrayList<>();
        for (int i = 1;i < 10 ; i++){
            User user = new User();
            user.setId(i);
            user.setName("李四"+i);
            users.add(user);
        }
       m.addAttribute("users",users);
        m.addAttribute("username","hahahh");
        return "index";
    }
}
