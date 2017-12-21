package com.sqm.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * <p>AOP切面:前置通知类
 *
 * @author sqm
 * @version 1.0
 */
public class MyMethodBeforeAdvice implements MethodBeforeAdvice{
    /**
     *<p>
     *  方法在目标类的方法前执行,不影响目标类的方法
     *</p>
     *@param    method 代表业务方法
     *@param    objects 代表业务方法的参数列表
     *@param    o   目标对象
     */
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知");
    }
}
