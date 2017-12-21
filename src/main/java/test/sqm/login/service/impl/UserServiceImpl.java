package test.sqm.login.service.impl;

import test.sqm.login.exception.PasswordException;
import test.sqm.login.exception.UserException;
import test.sqm.login.exception.UsernameException;
import test.sqm.login.service.UserService;

/**
 * <p>
 *  业务接口实现类
 * @author sqm
 * @version 1.0
 */
public class UserServiceImpl implements UserService {
    public boolean check(String username, String password) throws UserException {
        if (!"admin".equals(username)) {
            throw new UsernameException("用户名有误");
        }
        if (!"admin".equals(password)) {
            throw new PasswordException("密码有误");
        }
        System.out.println("用户正确");
        return true;
    }
}
