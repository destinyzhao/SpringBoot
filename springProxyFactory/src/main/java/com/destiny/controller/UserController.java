package com.destiny.controller;

import com.destiny.proxy.JdkProxyFactory;
import com.destiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private  UserService userService;

    // http://localhost:8080/test
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public void  JdkProxyTest() {
        //创建工厂对象
        JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(userService);
        UserService proxy = (UserService) jdkProxyFactory.getProxyObject();
        proxy.save();
        System.out.println("=========================");
        proxy.select();
    }



}

