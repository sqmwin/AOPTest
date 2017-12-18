import com.sqm.handler.MyInvocationHandler;
import com.sqm.pojo.Student;
import com.sqm.service.IService;
import com.sqm.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.lang.reflect.Proxy;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class Test {
    @org.junit.Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student sqm = (Student) context.getBean("sqm");
        System.out.println(sqm.toString());
    }

    //动态代理加强方法
    @org.junit.Test
    public void test02() {
        IService service = new StudentServiceImpl();
        IService proxyService = (IService) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new MyInvocationHandler(service));
        proxyService.doSome();
        proxyService.doOther();
    }

}
