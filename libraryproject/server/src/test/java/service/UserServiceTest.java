package service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
     * ok
     * 通过id查找用户测试
     */
    @Test
    public void findUserByIdTest() {
        String res = this.userService.findUser_uid(1);
        JSONObject jsonObject = JSON.parseObject(res);
        System.out.println(jsonObject);
    }

    /**
     * ok
     * 登录验证测试
     */
    @Test
    public void verifyLoginTest() {
        String result = this.userService.findUser_uname_uword("shrewd", "123");
        JSONObject jsonObject = JSON.parseObject(result);
        System.out.println(jsonObject.toString());
    }

    /**
     * ok
     * 查找所有用户的列表测试
     */
    @Test
    public void getAllUserListTest() {
        String result = this.userService.findAllUser();
        JSONArray jsonArray = JSON.parseArray(result);
        for (int i = 0; i < jsonArray.size(); i++) {
            System.out.println(jsonArray.get(i).toString());
        }
    }

    /**
     * ok
     * 添加一个用户测试
     */
    @Test
    public void addUser() {
        String result = this.userService.addUser_uname_upwd_urole("fuck", "123", -1);
        System.out.println(result);
    }

    /**
     * ok
     * 删除一个用户测试
     */
    @Test
    public void deleteUserByUNameAndPassWordTest() {
        String result = this.userService.deleteUser_uid_uname_upwd(14, "fuck", "123");
        System.out.println(result);
    }
}
