package org.fade.pattern.sp.bridge.improve.brand;

/**
 * 桥接模式
 * 改进
 * 小米品牌
 * @author fade
 * */
public class Mi implements Brand {


    /**
     * 开机
     */
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    /**
     * 关机
     */
    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }

}
