package pojo;

import com.shrewd.pojo.User;
import org.junit.Test;

public class UserTest {

    @Test
    public void test() {
        User user = new User(123, "shrewd", "123", 1);
        System.out.println(user);
    }
}
