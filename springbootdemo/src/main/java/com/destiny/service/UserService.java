package com.destiny.service;

import com.destiny.bean.User;

import java.util.List;

public interface UserService {

    // 增加用户
    int addUser(User user);

    // 删除用户
    int deleteUser(int userId);

    // 修改用户
    int updateUser(User user);

    // 根据用户Id查询用户
    User findUserById(int userId);

    // 查询所有用户
    List<User> findUserList();
}
