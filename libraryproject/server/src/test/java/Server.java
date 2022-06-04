import com.shrewd.service.impl.UserServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Server {

    public static void main(String[] args) {

        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setAddress("http://localhost:8000/ws/user");
        factory.setServiceBean(new UserServiceImpl());
        factory.create();

        System.out.println("release success!");
        System.out.println("address: http://localhost:8000/ws/user!");
    }
}
