package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * 屏幕
 * @author fade
 * */
public class Screen {

    private static final Screen instance = new Screen();

    private Screen(){

    }

    public static Screen getInstance() {
        return instance;
    }

    /**
     * 让屏幕上升
     * */
    public void up(){
        System.out.println("Screen is rising");
    }

    /**
     * 让屏幕下降
     * */
    public void down(){
        System.out.println("Screen is going down");
    }

}
