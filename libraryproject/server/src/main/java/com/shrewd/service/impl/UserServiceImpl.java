package com.shrewd.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.shrewd.dao.UserDao;
import com.shrewd.pojo.User;
import com.shrewd.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDao();
    }

    //SELECT
    /**
     * ok
     * 查找用户
     * @param id 用户ID
     * @return JSON格式的 uId uName uRole, 失败返回"null"
     */
    @Override
    public String findUser_uid(int id) {
        User user = userDao.findUser(id);
        if (user != null) {
            //拿到user的JsonObject
            JSONObject jsonObject = user.getJsonObject();
            //转换成string类型传输
            String return_result = jsonObject.toJSONString();
            return return_result;
        }
        return "null";
    }

    /**
     * ok
     * 查找用户
     * @param username 用户名
     * @param password 密码
     * @return JSON格式的 uId uName uRole, 失败返回"null"
     */
    @Override
    public String findUser_uname_uword(String username, String password) {
        User user = this.userDao.findUser(username, password);
        if (user != null) {
            //拿到user的JsonObject
            JSONObject jsonObject = user.getJsonObject();
            //转换成string类型传输
            String return_result = jsonObject.toJSONString();
            return return_result;
        }
        return "null";
    }

    /**
     * ok
     * 查找所有用户的列表
     * @return JSON格式的 List, 失败返回"null"
     */
    @Override
    public String findAllUser() {
        List<User> userList = this.userDao.findAllUser();
        if (userList != null) {
            JSONArray jsonArray = new JSONArray();
            for (User user: userList) {
                jsonArray.add(user.getJsonObject());
            }
            String return_result = jsonArray.toJSONString();
            return return_result;
        }
        return "null";
    }

    //INSERT INTO
    /**
     * ok
     * 添加一个用户
     * @param username 用户名
     * @param password 密码
     * @param role 身份
     * @return 受到影响的行数
     */
    @Override
    public String addUser_uname_upwd_urole(String username, String password, int role) {
        int return_result = this.userDao.addUser(username, password, role);
        return String.valueOf(return_result);
    }

    //DELETE
    /**
     * ok
     * 删除一个用户
     * @param uId 用户ID
     * @param username 用户名
     * @param password 密码
     * @return 受到影响的行数
     */
    @Override
    public String deleteUser_uid_uname_upwd(int uId, String username, String password) {
        int return_result = this.userDao.deleteUserByUIdAndUNameAndPassWord(uId, username, password);
        return String.valueOf(return_result);
    }
}
