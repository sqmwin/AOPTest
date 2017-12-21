package com.sqm.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author sqm
 * @version 1.0
 */
public class MyMethodInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        //前置增强
        System.out.println("执行前的增强");
        //执行目标方法
        Object result = methodInvocation.proceed();
        //修改目标方法的返回值
        if (result != null) {
            result = (Integer)result + 10;
        }
        //后置增强
        System.out.println("执行后的增强");
        return result;
    }
}
