package com.shrewd.service;

import javax.jws.WebService;

@WebService
public interface UserService {

    /**
     * 通过id查找用户
     * @param id
     * @return 成功返回String类型用户所有属性, 失败返回"null"
     */
    public String findUserById(int id);

    /**
     * 登录验证
     * @param username 用户名
     * @param password 密码
     * @return 成功返回String类型用户所有属性, 失败返回"null"
     */
    public String verifyLogin(String username, String password);

    /**
     * 添加一个用户
     * @param username 用户名
     * @param password 密码
     * @param role 身份
     * @return 成功返回String类型的1, 失败返回0
     */
    public String addUser(String username, String password, int role);
}
