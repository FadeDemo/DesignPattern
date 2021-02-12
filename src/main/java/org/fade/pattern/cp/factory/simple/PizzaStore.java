package org.fade.pattern.cp.factory.simple;

/**
 * 工厂模式
 * 简单工厂模式
 * @author fade
 * */
public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory());
    }

}
