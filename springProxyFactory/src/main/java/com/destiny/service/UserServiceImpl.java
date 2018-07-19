package com.destiny.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public  void  save(){
        System.out.println("保存用户信息成功！");
    }

    @Override
    public  int select(){
        System.out.println("查询用户信息成功！");
        return 1;
    }
}

