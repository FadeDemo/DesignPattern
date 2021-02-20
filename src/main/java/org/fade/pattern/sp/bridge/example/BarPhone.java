package org.fade.pattern.sp.bridge.example;

/**
 * 桥接模式
 * 例子
 * 直立式手机
 * @author fade
 * */
public abstract class BarPhone extends Phone {

    @Override
    public void open() {
        System.out.print("直立式");
    }

    @Override
    public void call() {
        System.out.print("直立式");
    }

    @Override
    public void close() {
        System.out.print("直立式");
    }

}
