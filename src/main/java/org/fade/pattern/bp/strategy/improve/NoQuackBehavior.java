package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 不能叫的策略类
 * @author fade
 * */
public class NoQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("不能叫......");
    }

}
