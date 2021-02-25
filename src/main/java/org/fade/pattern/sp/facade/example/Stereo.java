package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * 立体声
 * @author fade
 * */
public class Stereo {

    private static final Stereo instance = new Stereo();

    private Stereo(){

    }

    public static Stereo getInstance() {
        return instance;
    }

    /**
     * 打开立体声
     * */
    public void on(){
        System.out.println("Stereo is on");
    }

    /**
     * 关闭立体声
     * */
    public void off(){
        System.out.println("Stereo is off");
    }

    /**
     * 调大音量
     * */
    public void up(){
        System.out.println("Turn the volume up");
    }

    /**
     * 调小音量
     * */
    public void down(){
        System.out.println("Turn the volume down");
    }

}
