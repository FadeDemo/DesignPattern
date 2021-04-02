package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 不能游泳的策略类
 * @author fade
 * */
public class NoSwimBehavior implements SwimBehavior {

    @Override
    public void swim() {
        System.out.println("不能游泳......");
    }

}
