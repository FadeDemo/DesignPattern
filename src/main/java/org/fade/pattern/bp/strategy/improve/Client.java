package org.fade.pattern.bp.strategy.improve;

/**
 * 策略模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Duck wildDuck = new WildDuck();
        Duck pekingDuck = new PekingDuck();
        Duck toyDuck = new ToyDuck();
        wildDuck.display();
        System.out.println("*************split*************");
        pekingDuck.display();
        System.out.println("*************split*************");
        toyDuck.display();
    }

}
