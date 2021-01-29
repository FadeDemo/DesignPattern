package org.fade.principle.isp;

/**
 * 接口隔离原则（遵循）
 * @author fade
 * */
public class ISP1 {

    public static void main(String[] args){
        //A类通过接口依赖B类
        A1 a = new A1();
        a.depend1(new B1());
        a.depend2(new B1());
        a.depend3(new B1());
        //C类通过接口依赖D类
        C1 c = new C1();
        c.depend1(new D1());
        c.depend4(new D1());
        c.depend5(new D1());
    }

}

interface Interface1{

    void operation1();

}

interface Interface2{

    void operation2();

    void operation3();

}

interface Interface3{

    void operation4();

    void operation5();

}

class B1 implements Interface1,Interface2{

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

}

class D1 implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D implements operation1");
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

class A1{

    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend2(Interface2 i){
        i.operation2();
    }

    public void depend3(Interface2 i){
        i.operation3();
    }

}

class C1{

    public void depend1(Interface1 i){
        i.operation1();
    }

    public void depend4(Interface3 i){
        i.operation4();
    }

    public void depend5(Interface3 i){
        i.operation5();
    }

}


