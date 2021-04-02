package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 北京鸭
 * @author fade
 * */
public class PekingDuck extends Duck {

    public PekingDuck(){
        this.setFlyBehavior(new NoFlyBehavior());
        this.setQuackBehavior(new CanQuackBehavior());
        this.setSwimBehavior(new CanSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是北京鸭......");
        this.fly();
        this.quack();
        this.swim();
    }

}
