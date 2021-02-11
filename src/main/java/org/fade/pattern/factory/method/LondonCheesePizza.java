package org.fade.pattern.factory.method;

import org.fade.pattern.factory.example.Pizza;

/**
 * 工厂模式
 * 工厂方法模式
 * @author fade
 * */
public class LondonCheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("LondonCheesePizza");
        System.out.println("prepare raw materials for London CheesePizza");
    }

}
