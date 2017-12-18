package com.sqm.processor;

/**
 * <p>
 *     事务处理类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyTransactionProcessor {
    //交叉业务逻辑,处理事务
    public static void doTransaction(Class<?> clazz) {
        System.out.println("我是事务代码,执行我的类为" + clazz.getName());
    }
}
