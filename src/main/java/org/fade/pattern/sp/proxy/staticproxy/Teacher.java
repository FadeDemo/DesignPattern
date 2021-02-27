package org.fade.pattern.sp.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 * 目标对象
 * @author fade
 * */
public class Teacher implements ITeacher{


    @Override
    public void teach() {
        System.out.println("上课......");
    }

}
