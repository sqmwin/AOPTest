package com.sqm.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * <p>AOP切面:后置通知
 *
 * @author sqm
 * @version 1.0
 */
public class MyAfterReturningAdvice implements AfterReturningAdvice {
    /**
     *<p>后置通知方法，不影响代理方法的执行，代理方法的返回值会传入此方法中
     *
     *@param    o   代理方法有返回值；若无返回值则为null
     *@param    method  代理方法
     *@param    objects 代理目标的方法的参数列表
     *@param    o1  代理目标对象
     */
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置通知+返回值" + o);
    }
}
