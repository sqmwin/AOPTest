import com.sqm.handler.MyInvocationHandler;
import com.sqm.pojo.Student;
import com.sqm.service.StudentService;
import com.sqm.service.StudentServiceImpl;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public class AopTest {
    private ApplicationContext context;

    @Before
    public void setUp() {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void test01() {
        Student sqm = (Student) context.getBean("sqm");
        System.out.println(sqm.toString());
    }

    //动态代理加强方法
    @Test
    public void test02() {
        StudentService service = new StudentServiceImpl();
        StudentService proxyService = (StudentService) Proxy.newProxyInstance(service.getClass().getClassLoader(), service.getClass().getInterfaces(), new MyInvocationHandler(service));
        proxyService.doSome();
        proxyService.doOther(2);
    }

    //AOP之切面:前置通知织入到目标对象中
    @Test
    public void test03() {
        StudentService service = (StudentService) context.getBean("studentServiceBeforeProxy");
        service.doSome();
        service.doOther(3);
    }

    //Aop切面：后置通知
    @Test
    public void test04() {
        StudentService studentService = (StudentService) context.getBean("studentServiceAfterProxy");
        studentService.doSome();
        studentService.doOther(4);
    }

    //aop切面:方法拦截器
    @Test
    public void test05() {
        StudentService studentService = (StudentService) context.getBean("studentServiceInterceptProxy");
        studentService.doSome();
        int result = studentService.doOther(5);
        System.out.println("改变方法结果为:" + result);
    }

    //aop切面:代理中织入多个切面
    @Test
    public void test06() {
        StudentService studentService = (StudentService) context.getBean("studentServiceAdviceProxy");
        studentService.doSome();
        studentService.doOther(6);
    }

    //强制使用cglib代理生成代理对象
    @Test
    public void test07() {
        StudentService studentService = (StudentService) context.getBean("studentServiceCglibProxy");
        studentService.doSome();
        studentService.doOther(7);
    }
    
    //aop切面:顾问:针对名称匹配的方法调用相应的通知
    @Test
    public void test08() {
        StudentService studentService = (StudentService) context.getBean("studentServiceNameMatchAdvisorProxy");
        studentService.doSome();
        studentService.doOther(8);
    }

    //aop切面:顾问:正则表达式顾问
    @Test
    public void test09() {
        StudentService studentService = (StudentService) context.getBean("studentServiceRegexpAdvisorProxy");
        studentService.doSome();
        studentService.doOther(9);
    }

    //默认Advisor自动代理生成器
    @Test
    public void test10() {
        StudentService studentService = (StudentService) context.getBean("studentServiceTarget");
        studentService.doSome();
        studentService.doOther(10);
    }

    //bean名称自动代理生成器:通过beanNames指定要代理的bean的id,通过interceptorNames指定要织入的切面,切面可以是Advice也可以是Advisor
    @Test
    public void test11() {
        StudentService studentService = (StudentService) context.getBean("studentServiceTarget");
        StudentService teacherService = (StudentService) context.getBean("teacherServiceTarget");
        studentService.doSome();
        studentService.doOther(11);
        teacherService.doSome();
        studentService.doOther(11);
    }




}
