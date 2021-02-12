package org.fade.pattern.cp.abstraction;

/**
 * 抽象工厂模式
 * @author fade
 * */
public class PizzaStore {

    public static void main(String[] args) {
        OrderPizza order = new OrderPizza();
//        order.setFactory(new BeijingFactory());
        order.setFactory(new LondonFactory());
    }

}
