package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * 投影仪
 * @author fade
 * */
public class Projector {

    private static final Projector instance = new Projector();

    private Projector(){

    }

    public static Projector getInstance() {
        return instance;
    }

    /**
     * 打开投影仪
     * */
    public void on(){
        System.out.println("Projector is on");
    }

    /**
     * 关闭投影仪
     * */
    public void off(){
        System.out.println("Projector is off");
    }

    /**
     * 让投影仪工作
     * */
    public void focus(){
        System.out.println("Projector is focusing");
    }

}
