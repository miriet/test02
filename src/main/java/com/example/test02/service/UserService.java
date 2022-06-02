package com.example.test02.service;

import com.example.test02.domain.User;
import com.example.test02.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public List<User> addUser(User pUser){
        User user = new User();
        user.setUserName("TED");
        user.setLoginId("miriet");
        user.setPasswd("1234");

        userRepository.save(user);
        return userRepository.findAll();
    }
}
