package com.destiny.controller;

import com.destiny.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private UserService userService;

    // http://localhost:8080/user/beans
    @GetMapping("/user/beans")
    @ResponseBody
    public String beans() throws Exception {
        //spring 工厂
        String xmlPath = "classpath:beans.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService) applicationContext.getBean("userServiceId");
        userService.addUser();

        //要求：1.容器必须close，销毁方法执行; 2.必须是单例的
//applicationContext.getClass().getMethod("close").invoke(applicationContext);
        // * 此方法接口中没有定义，实现类提供
        applicationContext.close();

        return "成功！";

    }
}

