package com.shrewd.service;

import javax.jws.WebService;

@WebService
public interface UserService {

    /**
     * 通过id查找用户
     * @param id 用户ID
     * @return 成功返回JSON格式用户所有属性, 失败返回"null"
     */
    public String findUser_uid(int id);

    /**
     * 通过用户名&密码查找用户
     * @param username 用户名
     * @param password 密码
     * @return 成功返回JSON格式的 uId uName uRole, 失败返回"null"
     */
    public String findUser_uname_uword(String username, String password);

    /**
     * 查找所有用户的列表
     * @return 返回所有用户的列表
     */
    public String findAllUser();

    /**
     * 添加一个用户
     * @param username 用户名
     * @param password 密码
     * @param role 身份
     * @return 受到影响的行数
     */
    public String addUser_uname_upwd_urole(String username, String password, int role);

    /**
     * 删除一个用户
     * @param uId 用户ID
     * @param username 用户名
     * @param password 密码
     * @return 受到影响的行数
     */
    public String deleteUser_uid_uname_upwd(int uId, String username, String password);
}
