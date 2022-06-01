package com.shrewd.service.impl;

import com.shrewd.dao.UserDao;
import com.shrewd.pojo.User;
import com.shrewd.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDao();
    }

    //SELECT METHOD
    //通过id查找用户
    @Override
    public String findUserById(int id) {
        User user = userDao.findUserByUId(id);
        if (user != null) {
            return user.toString();
        }
        return "null";
    }

    //登录验证登录验证
    @Override
    public String verifyLogin(String username, String password) {
        User user = this.userDao.findUserByUNameAndPassWord(username, password);
        if (user != null) {
            return user.toString();
        }
        return "null";
    }

    //INSERT INTO METHOD
    //添加一个用户
    @Override
    public String addUser(String username, String password, int role) {
        return String.valueOf(this.userDao.addUser(username, password, role));
    }
}
