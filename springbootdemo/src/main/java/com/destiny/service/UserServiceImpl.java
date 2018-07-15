package com.destiny.service;

import com.destiny.bean.User;
import com.destiny.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements  UserService {

    @Autowired
    private UserDao userDAO;

    /**
     * 增加用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public int addUser(User user) {
        return userDAO.addUser(user);
    }

    /**
     * 更新用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public int updateUser(User user) {
        return userDAO.updateUser(user);
    }

    /**
     * 删除用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public int deleteUser(int id) {
        return userDAO.deleteUser(id);
    }

    /**
     * 根据用户Id查询用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public User findUserById(int id) {
        return userDAO.findUserById(id);
    }

    /**
     * 查询所有用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public List<User>findUserList() {
        return userDAO.findUserList();
    }
}
