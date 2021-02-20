package org.fade.pattern.sp.bridge.example.style;

import org.fade.pattern.sp.bridge.example.prototype.Phone;

/**
 * 桥接模式
 * 例子
 * 旋转式手机
 * @author fade
 * */
public abstract class RotaryPhone extends Phone {

    @Override
    public void open() {
        System.out.print("旋转式");
    }

    @Override
    public void call() {
        System.out.print("旋转式");
    }

    @Override
    public void close() {
        System.out.print("旋转式");
    }

}
