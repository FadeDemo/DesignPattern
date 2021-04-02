package org.fade.pattern.bp.strategy.example;

/**
 * 策略模式
 * 例子
 * 抽象鸭子类
 * @author fade
 * */
public abstract class Duck {

    public Duck() {

    }

    /**
     * 显示鸭子信息
     * */
    public abstract void display();

    protected void quack() {
        System.out.println("鸭子嘎嘎叫~~");
    }

    protected void swim() {
        System.out.println("鸭子会游泳~~");
    }

    protected void fly() {
        System.out.println("鸭子会飞翔~~~");
    }

}
