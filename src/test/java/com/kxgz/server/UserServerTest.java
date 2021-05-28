package com.kxgz.server;

import com.kxgz.pojo.User;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServerTest {

    @Autowired
    private UserServer userServer;

    @Test
    void queryById() {
        User user = userServer.queryById(1L);
        System.out.println("gggggg:"+user);
    }

    @Test
    void saveUser() {
    }
}