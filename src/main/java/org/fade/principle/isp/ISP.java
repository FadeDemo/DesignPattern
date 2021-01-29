package org.fade.principle.isp;

/**
 * 接口隔离原则（违反）
 * @author fade
 * */
public class ISP {

    public static void main(String[] args){
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }

}

interface Interface{

    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();

}

class B implements Interface{

    @Override
    public void operation1() {
        System.out.println("B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B implements operation5");
    }

}

class D implements Interface{

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D implements operation5");
    }

}

/**
 * A类通过Interface依赖(引用)B类，但是只会用到operation1()、operation2()、operation3()方法
 * */
class A{

    public void depend1(Interface i){
        i.operation1();
    }

    public void depend2(Interface i){
        i.operation2();
    }

    public void depend3(Interface i){
        i.operation3();
    }

}

/**
 * C类通过Interface依赖(引用)D类，但是只会用到operation1()、operation4()、operation5()方法
 * */
class C{

    public void depend1(Interface i){
        i.operation1();
    }

    public void depend4(Interface i){
        i.operation4();
    }

    public void depend5(Interface i){
        i.operation5();
    }

}


