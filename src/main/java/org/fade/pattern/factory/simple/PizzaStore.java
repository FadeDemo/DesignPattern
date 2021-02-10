package org.fade.pattern.factory.simple;

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
