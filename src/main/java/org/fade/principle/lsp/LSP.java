package org.fade.principle.lsp;

/**
 * 里氏替换原则(违背)
 * @author fade
 * */
public class LSP {

    public static void main(String[] args){
        A a = new A();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-8="+a.fun1(1,8));
        System.out.println("***********split***********");
        B b = new B();
        //仍想使用继承自A类的方法，发现已经不行
        System.out.println("11-3="+b.fun1(11,3));
        System.out.println("1-8="+b.fun1(1,8));
        System.out.println("11+3+9="+b.fun2(11,3));
    }

}

class A{

    //可能无意识下重写了方法
    public int fun1(int a,int b){
        return a-b;
    }

}

class B extends A{

    @Override
    public int fun1(int a, int b) {
        return a+b;
    }

    public int fun2(int a,int b){
        return this.fun1(a,b) + 9;
    }

}
