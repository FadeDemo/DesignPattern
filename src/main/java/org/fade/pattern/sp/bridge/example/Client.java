package org.fade.pattern.sp.bridge.example;

import org.fade.pattern.sp.bridge.example.brand.huawei.HUAWEIBarPhone;

/**
 * 桥接模式
 * 例子
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        HUAWEIBarPhone phone = new HUAWEIBarPhone();
        phone.open();
        phone.call();
        phone.close();
    }

}
