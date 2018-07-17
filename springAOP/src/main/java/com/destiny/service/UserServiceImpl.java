package com.destiny.service;

import org.springframework.stereotype.Service;

// （注入dao）
@Service
public class UserServiceImpl implements UserService {

    @Override
    public  String queryUserById(int id){
        return "user home";
    }
}

