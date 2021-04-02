package org.fade.pattern.bp.strategy.example;

/**
 * 策略模式
 * 例子
 * 野鸭
 * @author fade
 * */
public class WildDuck extends Duck{

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是野鸭......");
        this.fly();
        this.quack();
        this.swim();
    }

}
