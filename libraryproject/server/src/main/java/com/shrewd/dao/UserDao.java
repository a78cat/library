package com.shrewd.dao;

import com.shrewd.pojo.User;
import com.shrewd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class UserDao {

    final static String MAPPER_PATH = "com.shrewd.mapper.UserMapper.";

    /**
     * 通过用户id查找用户
     * @param uId
     * @return User对象
     */
    public User findUserByUId(int uId) {
        SqlSession session = MybatisUtils.getSession();
        User user_result = session.selectOne(MAPPER_PATH + "findUserByUId", uId);
        session.close();
        if (user_result != null) {
            return user_result;
        }
        return null;
    }

    /**
     * 通过用户名和密码查找用户
     * @param uName
     * @param uPwd
     * @return User对象
     */
    public User findUserByUNameAndPassWord(String uName, String uPwd) {
        User user = new User();
        user.setuName(uName);
        user.setuPwd(uPwd);
        SqlSession session = MybatisUtils.getSession();
        User result = session.selectOne(MAPPER_PATH + "findUserByUNameAndPassWord", user);
        session.close();
        if (result != null) {
            return result;
        }
        return null;
    }

    /**
     * 添加一个用户
     * @param uName
     * @param uPwd
     * @return User对象
     */
    public int addUser(String uName, String uPwd, int uRole) {
        User user = new User();
        user.setuName(uName);
        user.setuPwd(uPwd);
        user.setuRole(uRole);
        SqlSession session = MybatisUtils.getSession();
        int result = session.insert(MAPPER_PATH + "addUser", user);
        session.commit();
        session.close();
        return result;
    }
}
