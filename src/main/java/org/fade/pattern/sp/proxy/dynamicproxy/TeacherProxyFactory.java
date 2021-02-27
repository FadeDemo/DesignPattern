package org.fade.pattern.sp.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * 代理模式
 * 动态代理
 * 代理工厂类
 * @author fade
 * */
public class TeacherProxyFactory {

    private Object teacher;

    public TeacherProxyFactory(Object teacher){
        this.teacher = teacher;
    }

    public Object getTeacherProxyInstance(){
        return Proxy.newProxyInstance(teacher.getClass().getClassLoader(),
                teacher.getClass().getInterfaces(), (proxy, method, args) -> {
                    System.out.println("动态代理开始......");
                    Object returnVal = method.invoke(teacher,args);
                    System.out.println("动态代理结束......");
                    return returnVal;
                });
    }

}
