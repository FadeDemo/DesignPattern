package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 玩具鸭
 * @author fade
 * */
public class ToyDuck extends Duck{

    public ToyDuck(){
        this.setFlyBehavior(new NoFlyBehavior());
        this.setQuackBehavior(new NoQuackBehavior());
        this.setSwimBehavior(new NoSwimBehavior());
    }

    @Override
    public void display() {
        System.out.println("这是玩具鸭......");
        this.fly();
        this.quack();
        this.swim();
    }

}
