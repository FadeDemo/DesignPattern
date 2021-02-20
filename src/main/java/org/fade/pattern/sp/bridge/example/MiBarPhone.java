package org.fade.pattern.sp.bridge.example;

/**
 * 桥接模式
 * 例子
 * 小米直立式手机
 * @author fade
 * */
public class MiBarPhone extends BarPhone {

    @Override
    public void open() {
        super.open();
        System.out.println("小米手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("小米手机打电话");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("小米手机关机");
    }

}
