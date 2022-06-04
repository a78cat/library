package com.shrewd.utils;

import com.shrewd.service.UserService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class ServiceUtils {

    private static JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

    public static UserService getUserService() {
        factory.setAddress("http://localhost:8000/ws/user");
        factory.setServiceClass(UserService.class);
        return factory.create(UserService.class);
    }

}
