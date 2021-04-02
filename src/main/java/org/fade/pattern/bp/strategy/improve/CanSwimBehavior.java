package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 能游泳的策略类
 * @author fade
 * */
public class CanSwimBehavior implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("可以游泳......");
    }

}
