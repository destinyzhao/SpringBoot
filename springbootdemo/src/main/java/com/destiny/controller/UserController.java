package com.destiny.controller;

import com.destiny.bean.User;
import com.destiny.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/user",produces = "application/json")


public class UserController {

    @Autowired
    private UserService userService;


    // 改成GET方式方便测试

    // http://localhost:8080/user/getUsers
    @RequestMapping(value = "/getUsers",method = RequestMethod.GET)
    /**
     * 获取所有用户
     * @author Destiny
     * @date 2018/7/15
     * @param []
     * @return java.util.List<com.destiny.bean.User>
     */
    public List<User> getUsers() {
        return userService.findUserList();
    }


   // http://localhost:8080/user/getUser/?userId=1
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    /**
     * 根据用户Id获取用户
     * @author Destiny
     * @date 2018/7/15
     * @param [id]
     * @return com.destiny.bean.User
     */
    public User getUser( @RequestParam(value = "userId" )int userId){

        return userService.findUserById(userId);
    }

    // http://localhost:8080/user/updateUser/?userId=1&userName=刘牧师&userAge=50
    @RequestMapping(value = "/updateUser",method = RequestMethod.GET)
    /**
     * 更新用户
     * @author Destiny
     * @date 2018/7/15
     * @param [userId, userName, userAge]
     * @return java.lang.String
     */
    public String updateUser(@RequestParam(value = "userId" )int userId ,
                             @RequestParam(value = "userName")String userName,
                             @RequestParam(value = "userAge" )int userAge){
        User user=new User();
        user.setUserId(userId);
        user.setUserName(userName);
        user.setUserAge(userAge);

        int t=userService.updateUser(user);
        if(t==1){
            return "更新成功";
        }else {
            return "更新失败";
        }
    }

    // http://localhost:8080/user/addUser/?userName=Alex&userAge=20
    @RequestMapping(value = "/addUser",method = RequestMethod.GET)
    /**
     * 新增用户
     * @author Destiny
     * @date 2018/7/15
     * @param [userName, userAge]
     * @return java.lang.String
     */
    public String addUser(@RequestParam(value = "userName")String userName,
                          @RequestParam(value = "userAge" )int userAge){
        User user=new User();
        user.setUserName(userName);
        user.setUserAge(userAge);
        int t= userService.addUser(user);
        if(t==1){
            return "增加失败";
        }else {
            return "增加成功";
        }

    }

    // http://localhost:8080/user/deleteUser/?userId=1
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
   /**
    * 根据用户Id删除用户
    * @author Destiny
    * @date 2018/7/15
    * @param [userId]
    * @return java.lang.String
    */
    public String deleteUser(@RequestParam(value = "userId" )int userId){

        int t= userService.deleteUser(userId);
        if(t==1){
            return "删除成功！";
        }else {
            return "用户不存在";
        }
    }
}
