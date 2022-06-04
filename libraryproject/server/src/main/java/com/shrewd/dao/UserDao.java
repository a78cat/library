package com.shrewd.dao;

import com.shrewd.pojo.User;
import com.shrewd.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserDao {

    final static String MAPPER_PATH = "com.shrewd.mapper.UserMapper.";

    /*SELECT ONE*/
    /**
     * 通过用户id查找用户
     * @param uId 用户ID
     * @return User
     */
    public User findUser(int uId) {
        SqlSession session = MybatisUtils.getSession();
        User return_result = session.selectOne(MAPPER_PATH + "findUserByUId", uId);
        session.close();
        if (return_result != null) {
            return return_result;
        }
        return null;
    }

    /**
     * 通过用户名和密码查找用户
     * @param uName 用户名
     * @param uPwd 密码
     * @return User
     */
    public User findUser(String uName, String uPwd) {
        User user = new User();
        user.setuName(uName);
        user.setuPwd(uPwd);
        SqlSession session = MybatisUtils.getSession();
        User return_result = session.selectOne(MAPPER_PATH + "findUserByUNameAndPassWord", user);
        session.close();
        if (return_result != null) {
            return return_result;
        }
        return null;
    }

    /*SELECT LIST*/
    /**
     * 查找所有用户
     * @return List<User></>
     */
    public List<User> findAllUser() {
        SqlSession session = MybatisUtils.getSession();
        List<User> userList = session.selectList(MAPPER_PATH + "findAllUser");
        session.close();
        return userList;
    }

    /*INSERT INTO*/
    /**
     * 添加一个用户
     * @param uName 用户名
     * @param uPwd 密码
     * @return 受影响的行数
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

    /*DELETE*/
    /**
     * 删除一个用户
     * @param uId 用户ID
     * @param uName 用户名
     * @param uPwd 密码
     * @return 受影响的行数
     */
    public int deleteUserByUIdAndUNameAndPassWord(int uId, String uName, String uPwd) {
        User user = new User();
        user.setuId(uId);
        user.setuName(uName);
        user.setuPwd(uPwd);
        SqlSession session = MybatisUtils.getSession();
        int result = session.delete(MAPPER_PATH + "deleteUserByUIdAndUNameAndPassWord", user);
        session.commit();
        session.close();
        return result;
    }
}
