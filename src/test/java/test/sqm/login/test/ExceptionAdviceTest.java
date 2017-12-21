package test.sqm.login.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.sqm.login.exception.UserException;
import test.sqm.login.service.UserService;

/**
 * @author sqm
 * @version 1.0
 */
public class ExceptionAdviceTest {
    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("login/login-spring-config.xml");
    }

    //aop切面:异常通知
    @Test
    public void Test01(){
        String username = "admin";
        String password = "sqm";
        UserService service=(UserService)context.getBean("userServiceThrowsProxy");
        boolean result = false;
        try {
            result = service.check(username, password);
        } catch (UserException e) {
            e.printStackTrace();
        }
        System.out.println("result = " + result);
    }
}
