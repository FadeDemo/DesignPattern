package org.fade.pattern.sp.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理模式
 * CGLib代理
 * 代理工厂类
 * @author fade
 * */
public class TeacherProxyFactory implements MethodInterceptor {

    private Object teacher;

    public TeacherProxyFactory(Object teacher){
        this.teacher = teacher;
    }

    public Object getTeacherProxyInstance(){
        //1.创建工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(teacher.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLib代理开始......");
        Object returnVal = method.invoke(teacher,objects);
        // or
        methodProxy.invokeSuper(o, objects);
        // NOTE: error
//        methodProxy.invokeSuper(teacher, objects);
//        Object returnVal = method.invoke(o ,objects);
        System.out.println("CGLib代理结束......");
        return returnVal;
    }

}
