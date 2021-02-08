package org.fade.pattern.singleton.lazy.secure.method;

/**
 * 单例模式
 * 懒汉式(线程安全，同步方法)
 * @author fade
 * */
public class MethodExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{

    private static Singleton instance;

    //1.构造器私有化
    private Singleton(){

    }

    //3.向外提供一个静态的公共方法获取实例对象
    //仅当使用该方法时，才去创建instance
    public static synchronized Singleton getInstance() {
        //2.类的内部创建对象
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
