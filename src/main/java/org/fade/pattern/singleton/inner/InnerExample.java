package org.fade.pattern.singleton.inner;

/**
 * 单例模式
 * 静态内部类
 * @author fade
 * */
public class InnerExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{

    //1.构造器私有化
    private Singleton(){

    }

    private static class SingletonInstance{

        static {
            System.out.println("Class is loading");
        }

        //2.类的内部创建对象
        private static final Singleton instance = new Singleton();

    }

    public static Singleton getInstance(){
        System.out.println("开始调用静态内部类");
        return SingletonInstance.instance;
    }

}
