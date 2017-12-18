package com.sqm.processor;

/**
 * <p>
 *     日志处理类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class MyLogProcessor {
    //交叉业务逻辑,处理日志
    public static void doLog(Class<?> clazz){
        System.out.println("我是日志代码,执行我的是" + clazz.getName());
    }
}
