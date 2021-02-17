package org.fade.pattern.sp.adapter.clz;

/**
 * 适配器模式
 * 类适配器
 * 类适配器
 * @author fade
 * */
public class VoltageAdapter extends Voltage220 implements Voltage5 {

    @Override
    public int output5V() {
        int src = super.output220V();
        return src / 44;
    }

}
