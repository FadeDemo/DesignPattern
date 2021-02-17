package org.fade.pattern.sp.adapter.obj;

import org.fade.pattern.sp.adapter.clz.Voltage220;
import org.fade.pattern.sp.adapter.clz.Voltage5;

/**
 * 适配器模式
 * 对象适配器
 * 适配器
 * @author fade
 * */
public class VoltageAdapter implements Voltage5 {

    private Voltage220 voltage220;

    @Override
    public int output5V() {
        int src = 0;
        if (this.voltage220!=null){
            src = this.voltage220.output220V();
            return src / 44;
        }
        else{
            return src;
        }
    }

    public void setVoltage220(Voltage220 voltage220) {
        this.voltage220 = voltage220;
    }

}
