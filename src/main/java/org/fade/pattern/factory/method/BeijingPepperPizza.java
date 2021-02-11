package org.fade.pattern.factory.method;

import org.fade.pattern.factory.example.Pizza;

/**
 * 工厂模式
 * 工厂方法模式
 * @author fade
 * */
public class BeijingPepperPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("BeijingPepperPizza");
        System.out.println("prepare raw materials for Beijing PepperPizza");
    }

}
