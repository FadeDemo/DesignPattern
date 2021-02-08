package org.fade.pattern.singleton.hungry.block;

/**
 * 单例模式
 * 懒汉式（静态代码块）
 * @author fade
 * */
public class BlockExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{


    private static Singleton instance;

    //2.类的内部创建对象
    static {
        instance = new Singleton();
    }

    //1.构造器私有化
    private Singleton(){

    }

    //3.向外提供一个静态的公共方法获取实例对象
    public static Singleton getInstance() {
        return instance;
    }

}
