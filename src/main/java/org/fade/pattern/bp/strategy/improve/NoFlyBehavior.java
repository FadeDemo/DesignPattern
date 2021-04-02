package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 不能飞行的策略类
 * @author fade
 * */
public class NoFlyBehavior implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("不能飞行......");
    }

}
