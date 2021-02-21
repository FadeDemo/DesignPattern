package org.fade.pattern.sp.bridge.improve.brand;

/**
 * 桥接模式
 * 改进
 * 华为品牌
 * @author fade
 * */
public class HUAWEI implements Brand {


    /**
     * 开机
     */
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    /**
     * 关机
     */
    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    /**
     * 打电话
     */
    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }

}
