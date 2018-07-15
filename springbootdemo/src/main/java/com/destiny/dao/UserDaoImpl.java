package com.destiny.dao;

import com.destiny.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements  UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 新增用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public int addUser(User user) {
        int id =jdbcTemplate.update("INSERT INTO tb_user(user_name,user_age) VALUES (?,?)",user.getUserName(),user.getUserAge());
        return id;
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
        int id =jdbcTemplate.update("UPDATE tb_user set user_name=? ,user_age=? where user_id=?",user.getUserName(),user.getUserAge(),user.getUserId());
        return id;
    }

    /**
     * 删除用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public int deleteUser(int userId) {
        return jdbcTemplate.update("DELETE FROM tb_user where user_id=?",userId);
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
        List<User> list = jdbcTemplate.query("select * from tb_user where user_id = ?", new Object[]{id}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            User user = list.get(0);
            return user;
        }else{

            return null;
        }
    }

    /**
     * 查找所有用户
     * @author Destiny
     * @date 2018/7/15
     * @param
     * @return
     */
    @Override
    public List<User>findUserList() {
        List<User> list = jdbcTemplate.query("select * from tb_user", new Object[]{}, new BeanPropertyRowMapper(User.class));
        if(list!=null && list.size()>0){
            return list;
        }else{
            return null;
        }
    }
}
