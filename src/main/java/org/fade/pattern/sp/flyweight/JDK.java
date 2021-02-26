package org.fade.pattern.sp.flyweight;

/**
 * 享元模式
 * 在JDK中的应用实例
 * @author fade
 * */
public class JDK {

    public static void main(String[] args) {
        Integer x = Integer.valueOf(125);
        Integer y = Integer.valueOf(125);
        Integer z = Integer.valueOf(250);
        Integer u = Integer.valueOf(250);
        System.out.println("x的值是否和y相等："+x.equals(y));
        System.out.println("x和y是否指向同一个对象："+(x==y));
        System.out.println("z的值是否和u相等："+z.equals(u));
        System.out.println("z和u是否指向同一个对象："+(z==u));
    }

}
