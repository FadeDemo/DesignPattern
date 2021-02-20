package org.fade.pattern.sp.bridge.example;

/**
 * 桥接模式
 * 例子
 * 折叠式手机
 * @author fade
 * */
public abstract class FoldablePhone extends Phone {

    @Override
    public void open() {
        System.out.print("折叠式");
    }

    @Override
    public void call() {
        System.out.print("折叠式");
    }

    @Override
    public void close() {
        System.out.print("折叠式");
    }

}
