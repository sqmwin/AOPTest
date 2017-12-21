package test.sqm.login.exception;

/**
 * <p>用户登录案例的父类</p>
 * @author sqm
 * @version 1.0
 */
public class UserException extends Exception{
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }
}
