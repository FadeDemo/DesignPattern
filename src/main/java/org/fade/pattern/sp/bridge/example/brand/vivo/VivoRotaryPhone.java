package org.fade.pattern.sp.bridge.example.brand.vivo;

import org.fade.pattern.sp.bridge.example.style.RotaryPhone;

/**
 * 桥接模式
 * 例子
 * vivo旋转式手机
 * @author fade
 * */
public class VivoRotaryPhone extends RotaryPhone {

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
