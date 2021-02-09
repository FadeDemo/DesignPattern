package org.fade.pattern.singleton.lazy.secure.block;

/**
 * 单例模式
 * 懒汉式(线程安全，同步代码块)
 * @author fade
 * */
public class BlockExample {

    public static void main(String[] args) {

    }

}

class Singleton{

    private static Singleton instance;

    //1.构造器私有化
    private Singleton(){

    }

    //3.向外提供一个静态的公共方法获取实例对象
    //仅当使用该方法时，才去创建instance
    public static Singleton getInstance() {
        //2.类的内部创建对象
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}
