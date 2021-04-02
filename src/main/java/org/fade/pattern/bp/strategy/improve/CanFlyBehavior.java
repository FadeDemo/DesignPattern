package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 能飞行的策略类
 * @author fade
 * */
public class CanFlyBehavior implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("可以飞行......");
    }

}
