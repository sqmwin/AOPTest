package com.sqm.service;
/**
 * <p>
 * 业务实现类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class StudentServiceImpl implements StudentService {
    //主业务逻辑,实现接口
    public void doSome() {
        System.out.println(this.getClass().getSimpleName() + " doSome()");
    }

    //主业务逻辑,实现接口
    public int doOther(int a) {
        System.out.println(this.getClass().getSimpleName() + " doOther(" + a + ")");
        return a;
    }
}
