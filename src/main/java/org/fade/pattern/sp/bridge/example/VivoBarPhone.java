package org.fade.pattern.sp.bridge.example;

/**
 * 桥接模式
 * 例子
 * vivo直立式手机
 * @author fade
 * */
public class VivoBarPhone extends BarPhone {

    @Override
    public void open() {
        super.open();
        System.out.println("vivo手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("vivo手机打电话");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("vivo手机关机");
    }

}
