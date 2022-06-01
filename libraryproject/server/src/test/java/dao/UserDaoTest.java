package dao;

import com.shrewd.dao.UserDao;
import com.shrewd.pojo.User;
import org.junit.Test;

public class UserDaoTest {

    private UserDao userDao;

    public UserDaoTest() {
        userDao = new UserDao();
    }

    /**
     * 通过id查找用户（这是一个测试方法）
     */
    @Test
    public void findUserByUIdTest() {
        User user = this.userDao.findUserByUId(1);
        System.out.println(user);
    }

    /**
     * 通过用户名和密码查找用户（用户登录验证）
     */
    @Test
    public void findUserByUNameAndPassWordTest() {
        User user = this.userDao.findUserByUNameAndPassWord("sss", "333");
        System.out.println(user);
    }

    /**
     * 添加一个用户
     */
    @Test
    public void addUserTest() {
        int res = userDao.addUser("aaa", "123", 1);
        System.out.println(res);
    }
}
