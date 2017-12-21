package com.sqm.service;

/**
 * <p>
 *
 * @author sqm
 * @version 1.0
 */
public class TeacherService implements StudentService{
    public void doSome() {
        System.out.println(this.getClass().getSimpleName() + " doSome()");
    }

    public int doOther(int a) {
        System.out.println(this.getClass().getSimpleName() + " doOther(" + a + ")");
        return a;
    }
}
