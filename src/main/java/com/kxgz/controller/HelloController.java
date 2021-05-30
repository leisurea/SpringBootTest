package com.kxgz.controller;

import com.kxgz.api.UserLoginToken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController//标注这是一个处理器
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${abc.name}")
    private String name;

    @UserLoginToken
    @GetMapping("hello")
    public String hello(){
        System.out.println("name = " + name);
        System.out.println("dataSource = " + dataSource);
        return "干爆鸡丁";
    }

}
