package org.fade.principle.lsp;

/**
 * 里氏替换原则(遵循)
 * @author fade
 * */
public class LSP1 {

    public static void main(String[] args){
        A1 a = new A1();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-8="+a.fun1(1,8));
        System.out.println("***********split***********");
        B1 b = new B1();
        //仍可以使用A类方法
        System.out.println("11-3="+b.fun3(11,3));
        System.out.println("1-8="+b.fun3(1,8));
        System.out.println("11+3+9="+b.fun2(11,3));
    }

}

/**
 * 更为基础的基类
 * */
class Base{

    public int fun1(int a,int b){
        return a-b;
    }

}

class A1 extends Base{



}

class B1 extends Base{

    //使用组合关系
    private A1 a = new A1();

    @Override
    public int fun1(int a, int b) {
        return a+b;
    }

    public int fun2(int a,int b){
        return this.fun1(a,b) + 9;
    }

    //如仍需用到A
    public int fun3(int a,int b){
        return this.a.fun1(a,b);
    }

}