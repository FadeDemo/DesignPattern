package org.fade.pattern.sp.bridge.example.brand.huawei;

import org.fade.pattern.sp.bridge.example.style.FoldablePhone;

/**
 * 桥接模式
 * 例子
 * 华为折叠式手机
 * @author fade
 * */
public class HUAWEIFoldablePhone extends FoldablePhone {

    @Override
    public void open() {
        super.open();
        System.out.println("华为手机开机");
    }

    @Override
    public void call() {
        super.call();
        System.out.println("华为手机打电话");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("华为手机关机");
    }

}
