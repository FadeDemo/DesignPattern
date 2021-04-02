package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 能叫的策略类
 * @author fade
 * */
public class CanQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("可以叫......");
    }
}
