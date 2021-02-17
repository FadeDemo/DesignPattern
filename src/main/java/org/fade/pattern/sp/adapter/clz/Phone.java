package org.fade.pattern.sp.adapter.clz;

/**
 * 适配器模式
 * 类适配器
 * 手机
 * @author fade
 * */
public class Phone {

    public void charge(Voltage5 voltage){
        int dst = voltage.output5V();
        if (dst<=5){
            System.out.println("可以开始充电");
        }
        else{
            System.out.println("电压过高，不能充电");
        }
    }

}
