package com.kxgz.controller;

import com.kxgz.api.JsonResult;
import com.kxgz.pojo.User;
import com.kxgz.server.UserServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServer userServer;

    @GetMapping("/user/{id}")
    public JsonResult queryById(@PathVariable("id") Long id){
        User user = userServer.queryById(id);
        return new JsonResult<>(user);
    }

}
