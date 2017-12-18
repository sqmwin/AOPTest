package com.sqm.handler;

import com.sqm.processor.MyLogProcessor;
import com.sqm.processor.MyTransactionProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <p>
 *     动态代理类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyInvocationHandler implements InvocationHandler{
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用交叉业务逻辑
        MyTransactionProcessor.doTransaction(target.getClass());
        //调用主业务逻辑
        Object result = method.invoke(target, args);
        //调用交叉业务逻辑
        MyLogProcessor.doLog(target.getClass());
        return result;
    }
}
