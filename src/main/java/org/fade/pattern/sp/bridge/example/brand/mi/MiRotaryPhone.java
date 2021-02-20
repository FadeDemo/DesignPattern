package org.fade.pattern.sp.bridge.example.brand.mi;

import org.fade.pattern.sp.bridge.example.style.RotaryPhone;

/**
 * 桥接模式
 * 例子
 * 小米旋转式手机
 * @author fade
 * */
public class MiRotaryPhone extends RotaryPhone {

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
