package org.fade.pattern.sp.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        TeacherProxy teacherProxy = new TeacherProxy(new Teacher());
        teacherProxy.teach();
    }

}
