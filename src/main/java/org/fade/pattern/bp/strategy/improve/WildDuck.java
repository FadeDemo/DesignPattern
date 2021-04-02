package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 野鸭
 * @author fade
 * */
public class WildDuck extends Duck {

    public WildDuck(){
        this.setFlyBehavior(new CanFlyBehavior());
        this.setQuackBehavior(new CanQuackBehavior());
        this.setSwimBehavior(new CanSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是野鸭......");
        this.fly();
        this.quack();
        this.swim();
    }

}
