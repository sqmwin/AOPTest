package com.sqm.service;

import com.sqm.processor.MyLogProcessor;
import com.sqm.processor.MyTransactionProcessor;

/**
 * <p>
 * 业务实现类
 * </p>
 *
 * @author sqm
 * @version 1.0
 */
public class StudentServiceImpl implements IService {
    //主业务逻辑,实现接口
    public void doSome() {
        System.out.println(this.getClass().getSimpleName() + " doSome()");
    }

    //主业务逻辑,实现接口
    public void doOther() {
        System.out.println(this.getClass().getSimpleName() + " doOther()");
    }
}
