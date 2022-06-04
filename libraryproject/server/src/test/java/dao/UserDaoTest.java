package dao;

import com.shrewd.dao.UserDao;
import com.shrewd.pojo.User;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    private UserDao userDao;

    public UserDaoTest() {
        userDao = new UserDao();
    }

    /*SELECT ONE*/

    /**
     * 通过id查找用户（这是一个测试方法）
     */
    @Test
    public void findUserByUIdTest() {
        User user = this.userDao.findUser(1);
        System.out.println(user);
    }

    /**
     * 通过用户名和密码查找用户（用户登录验证）
     */
    @Test
    public void findUserByUNameAndPassWordTest() {
        User user = this.userDao.findUser("sss", "333");
        System.out.println(user);
    }

    /*SELECT List*/
    @Test
    public void findAllUserTest() {
        List<User> userList = this.userDao.findAllUser();
        for (User user: userList) {
        }
    }

    /*INSERT INTO List*/
    /**
     * 添加一个用户
     */
    @Test
    public void addUserTest() {
        int res = userDao.addUser("aaa", "123", 1);
        System.out.println(res);
    }

    /**
     * 删除一个用户
     */
    @Test
    public void deleteUserByUIdTest() {
        int res = userDao.deleteUserByUIdAndUNameAndPassWord(9, "aaa", "123");
        System.out.println(res);
    }
}
