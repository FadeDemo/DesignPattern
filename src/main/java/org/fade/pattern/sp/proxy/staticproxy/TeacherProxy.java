package org.fade.pattern.sp.proxy.staticproxy;

/**
 * 代理模式
 * 静态代理
 * 代理对象
 * @author fade
 * */
public class TeacherProxy implements ITeacher {

    private ITeacher teacher;

    public TeacherProxy(ITeacher teacher){
        this.teacher = teacher;
    }

    @Override
    public void teach() {
        System.out.println("静态代理开始......");
        teacher.teach();
        System.out.println("静态代理结束......");
    }

}
