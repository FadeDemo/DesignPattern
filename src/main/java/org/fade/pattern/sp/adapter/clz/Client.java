package org.fade.pattern.sp.adapter.clz;

/**
 * 适配器模式
 * 类适配器
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter());
    }

}
