package org.fade.pattern.bp.strategy.example;

/**
 * 策略模式
 * 例子
 * 玩具鸭
 * @author fade
 * */
public class ToyDuck extends Duck{

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("这是玩具鸭......");
        this.fly();
        this.quack();
        this.swim();
    }

    @Override
    protected void fly() {
        System.out.println("玩具鸭不能飞......");
    }

    @Override
    protected void quack() {
        System.out.println("玩具鸭不能叫......");
    }

    @Override
    protected void swim() {
        System.out.println("玩具鸭不能游泳......");
    }

}
