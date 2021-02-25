package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * DVD播放器
 * @author fade
 * */
public class DVDPlayer {

    /**
     * DVD播放器实例
     * 内部创建对象
     * */
    private static final DVDPlayer instance = new DVDPlayer();

    /**
     * Constructor of DVDPlayer
     * 构造器私有化
     * */
    private DVDPlayer(){

    }

    /**
     * 对外提供获取实例的静态方法
     * @return DVDPlayer实例
     * */
    public static DVDPlayer getInstance() {
        return instance;
    }

    /**
     * 打开DVD播放器
     * */
    public void on(){
        System.out.println("DVD player is on");
    }

    /**
     * 关闭DVD播放器
     * */
    public void off(){
        System.out.println("DVD player is off");
    }

    /**
     * DVD播放器正在播放影片
     * */
    public void play(){
        System.out.println("DVD player is playing");
    }

    /**
     * DVD播放器正在暂停
     * */
    public void pause(){
        System.out.println("DVD player is pausing");
    }

}
