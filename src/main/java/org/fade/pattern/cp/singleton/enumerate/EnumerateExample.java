package org.fade.pattern.cp.singleton.enumerate;

/**
 * 单例模式
 * 枚举
 * @author fade
 * */
public class EnumerateExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
    }

}

enum Singleton{

    INSTANCE;

}