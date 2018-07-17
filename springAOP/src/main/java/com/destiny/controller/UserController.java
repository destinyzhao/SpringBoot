package com.destiny.controller;

import com.destiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

// 控制器（注入服务）
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // http://localhost:8080/user/queryUserById/1
    @GetMapping("/user/queryUserById/{id}")
    @ResponseBody
    private String queryUserById(@PathVariable int id){
        return userService.queryUserById(id);
    }

}

