package org.fade.pattern.sp.proxy.cglibproxy;

/**
 * 代理模式
 * CGLib代理
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        TeacherProxyFactory factory = new TeacherProxyFactory(new Teacher());
        Teacher teacher = (Teacher) factory.getTeacherProxyInstance();
        teacher.teach();
    }

}
