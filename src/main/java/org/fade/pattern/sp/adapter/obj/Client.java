package org.fade.pattern.sp.adapter.obj;

import org.fade.pattern.sp.adapter.clz.Phone;
import org.fade.pattern.sp.adapter.clz.Voltage220;

/**
 * 适配器模式
 * 对象适配器
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();
        VoltageAdapter adapter = new VoltageAdapter();
        adapter.setVoltage220(new Voltage220());
        phone.charge(adapter);
    }

}
