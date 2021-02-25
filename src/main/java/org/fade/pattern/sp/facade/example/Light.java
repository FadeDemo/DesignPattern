package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * 灯光
 * @author fade
 * */
public class Light {

    private static final Light instance = new Light();

    private Light(){

    }

    public static Light getInstance() {
        return instance;
    }

    /**
     * 打开灯光
     * */
    public void on(){
        System.out.println("Light is on");
    }

    /**
     * 关闭灯光
     * */
    public void off(){
        System.out.println("Light is off");
    }

}
