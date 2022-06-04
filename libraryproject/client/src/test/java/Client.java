import com.shrewd.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class Client {

    public static void main(String[] args) {

        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8000/ws/user");
        factory.setServiceClass(UserService.class);

        //show time
        UserService userService = factory.create(UserService.class);

        String res = userService.findUser_uname_uword( "shrewd", "1238");
//        int res = userService.addUser("ccc", "123", -1);
        System.out.println(res);
    }
}
