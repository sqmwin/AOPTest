package test.sqm.login.service;

import test.sqm.login.exception.UserException;

/**
 *
 * 用户登陆业务接口
 *
 * @author sqm
 * @version 1.0
 */
public interface UserService {
    /**
     *<p>判断用户名和密码是否正确
     *@param    username 用户名
     *@param    password 密码
     *@return   boolean 是否正确
     *@throws  UserException 抛出异常父类
     */
    boolean check(String username,String password) throws UserException;
}
