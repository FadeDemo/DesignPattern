package org.fade.pattern.sp.facade.improve;

/**
 * 外观模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Theater {

    public static void main(String[] args) {
        Facade theater = new Facade();
        theater.ready();
        theater.play();
        theater.end();
    }

}
