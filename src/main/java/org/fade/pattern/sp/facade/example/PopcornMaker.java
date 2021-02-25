package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * 爆米花机
 * @author fade
 * */
public class PopcornMaker {

    private static final PopcornMaker instance = new PopcornMaker();

    private PopcornMaker(){

    }

    public static PopcornMaker getInstance() {
        return instance;
    }

    /**
     * 打开爆米花机
     * */
    public void on(){
        System.out.println("Popcorn maker is on");
    }

    /**
     * 关闭爆米花机
     * */
    public void off(){
        System.out.println("Popcorn maker is off");
    }

    /**
     * 让爆米花机工作
     * */
    public void run(){
        System.out.println("Popcorn maker is running");
    }

}
