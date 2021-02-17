package org.fade.pattern.sp.adapter.intf;

import org.fade.pattern.sp.adapter.clz.Voltage220;
import org.fade.pattern.sp.adapter.clz.Voltage5;

/**
 * 适配器模式
 * 接口适配器
 * 适配器
 * @author fade
 * */
public abstract class VoltageAdapter implements Voltage5,Voltage30 {

    private Voltage220 voltage220;

    public VoltageAdapter(){
        voltage220 = new Voltage220();
    }

    public Voltage220 getVoltage220() {
        return voltage220;
    }

    @Override
    public int output5V() {
        return 0;
    }

    @Override
    public int output30V() {
        return 0;
    }

}
