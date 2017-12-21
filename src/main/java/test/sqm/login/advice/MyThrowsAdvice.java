package test.sqm.login.advice;

import org.springframework.aop.ThrowsAdvice;
import test.sqm.login.exception.PasswordException;
import test.sqm.login.exception.UsernameException;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(UsernameException e) {
        System.out.println("异常通知捕获UsernameException," + e.getMessage());
    }

    public void afterThrowing(PasswordException e) {
        System.out.println("异常通知捕获PasswordException," + e.getMessage());
    }
}
