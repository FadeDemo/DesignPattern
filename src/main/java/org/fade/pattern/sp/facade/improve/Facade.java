package org.fade.pattern.sp.facade.improve;

import org.fade.pattern.sp.facade.example.*;

/**
 * 外观模式
 * 改进
 * 外观类
 * @author fade
 * */
public class Facade {

    private DVDPlayer dvdPlayer;

    private Light light;

    private PopcornMaker popcornMaker;

    private Projector projector;

    private Screen screen;

    private Stereo stereo;

    public Facade(){
        this.dvdPlayer = DVDPlayer.getInstance();
        this.light = Light.getInstance();
        this.popcornMaker = PopcornMaker.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    /**
     * 做好播放的准备工作
     * */
    public void ready(){
        System.out.println("-----------准备工作-----------");
        this.dvdPlayer.on();
        this.light.on();
        this.popcornMaker.on();
        this.popcornMaker.run();
        this.projector.on();
        this.screen.down();
        this.stereo.on();
        this.stereo.up();
    }

    /**
     * 播放
     * */
    public void play(){
        System.out.println("-----------正在播放-----------");
        this.light.off();
        this.projector.focus();
        this.dvdPlayer.play();
    }

    public void end(){
        System.out.println("-----------播放结束-----------");
        this.dvdPlayer.off();
        this.light.on();
        this.popcornMaker.off();
        this.projector.off();
        this.screen.up();
        this.stereo.down();
        this.stereo.off();
    }

}
