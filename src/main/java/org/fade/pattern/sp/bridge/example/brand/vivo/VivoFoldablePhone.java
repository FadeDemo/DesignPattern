package org.fade.pattern.sp.bridge.example.brand.vivo;

import org.fade.pattern.sp.bridge.example.style.FoldablePhone;

/**
 * 桥接模式
 * 例子
 * vivo折叠式手机
 * @author fade
 * */
public class VivoFoldablePhone extends FoldablePhone {

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
