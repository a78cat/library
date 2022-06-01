package service;

import com.shrewd.service.UserService;
import com.shrewd.service.impl.UserServiceImpl;
import org.junit.Test;

/***
 * WebService测试之User测试
 */
public class UserServiceTest {

    private UserService userService;

    public UserServiceTest() {
        userService = new UserServiceImpl();
    }

    /**
     * 通过id查找用户测试
     */
    @Test
    public void findUserByIdTest() {
        String res = this.userService.findUserById(1);
        System.out.println(res);
    }

    /**
     * 登录验证测试
     */
    @Test
    public void verifyLoginTest() {
        String result = this.userService.verifyLogin("shrewd", "123");
        System.out.println(result);
    }

    /**
     * 添加一个用户测试
     */
    @Test
    public void addUser() {
        String result = this.userService.addUser("fuck", "123", -1);
        System.out.println(result);
    }
}
