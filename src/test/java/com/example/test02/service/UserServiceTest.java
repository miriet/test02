package com.example.test02.service;

import com.example.test02.domain.User;
import com.example.test02.repository.UserRepository;
import org.hibernate.mapping.RootClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = RootContext.class)
class UserServiceTest {

    @Resource
    private UserRepository userRepository;
    @BeforeEach
    void setUp() {

    }

    @Test
    void addUser() {
        User user = new User();
        user.setUserName("TED");
        user.setLoginId("miriet");
        user.setPasswd("1234");

        userRepository.save(user);
    }
}