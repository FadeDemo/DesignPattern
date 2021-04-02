package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 抽象鸭子类
 * @author fade
 * */
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    private SwimBehavior swimBehavior;

    public void fly(){
        if (flyBehavior!=null){
            flyBehavior.fly();
        }
        else
            throw new NullPointerException("未初始化FlyBehavior");
    }

    public void quack(){
        if (quackBehavior!=null){
            quackBehavior.quack();
        }
        else
            throw new NullPointerException("未初始化QuackBehavior");
    }

    public void swim(){
        if (swimBehavior!=null){
            swimBehavior.swim();
        }
        else
            throw new NullPointerException("未初始化SwimBehavior");
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior) {
        this.swimBehavior = swimBehavior;
    }

}
