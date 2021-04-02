package org.fade.pattern.bp.strategy.example;

/**
 * 策略模式
 * 例子
 * 北京鸭
 * @author fade
 * */
public class PekingDuck extends Duck{

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是北京鸭......");
        this.fly();
        this.quack();
        this.swim();
    }

    @Override
    protected void fly() {
        System.out.println("北京鸭不能飞......");
    }

}
