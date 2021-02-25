package org.fade.pattern.sp.facade.example;

/**
 * 外观模式
 * 例子
 * 客户端
 * @author fade
 * */
public class Theater {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = DVDPlayer.getInstance();
        Light light = Light.getInstance();
        PopcornMaker popcornMaker = PopcornMaker.getInstance();
        Projector projector = Projector.getInstance();
        Screen screen = Screen.getInstance();
        Stereo stereo = Stereo.getInstance();
        System.out.println("-----------准备工作-----------");
        dvdPlayer.on();
        light.on();
        popcornMaker.on();
        popcornMaker.run();
        projector.on();
        screen.down();
        stereo.on();
        stereo.up();
        System.out.println("-----------正在播放-----------");
        light.off();
        projector.focus();
        dvdPlayer.play();
        System.out.println("-----------播放结束-----------");
        dvdPlayer.off();
        light.on();
        popcornMaker.off();
        projector.off();
        screen.up();
        stereo.down();
        stereo.off();
    }

}
