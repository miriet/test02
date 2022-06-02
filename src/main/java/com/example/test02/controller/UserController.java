package com.example.test02.controller;

import com.example.test02.domain.User;
import com.example.test02.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

   @Resource
   private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(){
        User user = new User();
        user.setUserName("TED");
        user.setLoginId("miriet");
        user.setPasswd("1234");

        return userService.addUser(user).toString();

    }
}
