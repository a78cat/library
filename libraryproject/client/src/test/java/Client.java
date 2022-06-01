import com.shrewd.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

    public static void main(String[] args) {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://192.168.1.115:8000/ws/user");
        factory.setServiceClass(UserService.class);

        //show time
        UserService userService = factory.create(UserService.class);

        int res = userService.verifyLogin("shrewd", "123");
//        int res = userService.addUser("ccc", "123", -1);
        System.out.println(res);
    }
}
