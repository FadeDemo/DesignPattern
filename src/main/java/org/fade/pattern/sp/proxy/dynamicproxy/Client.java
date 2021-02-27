package org.fade.pattern.sp.proxy.dynamicproxy;

import org.fade.pattern.sp.proxy.staticproxy.ITeacher;
import org.fade.pattern.sp.proxy.staticproxy.Teacher;

/**
 * 代理模式
 * 动态代理
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        TeacherProxyFactory factory = new TeacherProxyFactory(new Teacher());
        ITeacher teacher = (ITeacher) factory.getTeacherProxyInstance();
        teacher.teach();
    }

}
