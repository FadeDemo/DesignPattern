package org.fade.pattern.sp.adapter.intf;

import org.fade.pattern.sp.adapter.clz.Phone;

/**
 * 适配器模式
 * 接口适配器
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new VoltageAdapter() {

            @Override
            public int output5V() {
                int src = this.getVoltage220().output220V();
                return src / 44;
            }

        });
    }

}
