package com.shrewd.service;

import javax.jws.WebService;

@WebService
public interface UserService {

    /**
     * 登录验证
     * @param username 用户名
     * @param password 密码
     * @return 成功返回int类型的用户role, 失败返回-1
     */
    public int verifyLogin(String username, String password);


    /**
     * 添加一个用户
     * @param username 用户名
     * @param password 密码
     * @param role 身份
     * @return 成功返回int类型的1, 失败返回-1
     */
    public int addUser(String username, String password, int role);
}
