package org.fade.pattern.factory.method;

import org.fade.pattern.factory.example.Pizza;

/**
 * 工厂模式
 * 工厂方法模式
 * @author fade
 * */
public class BeijingOrderPizza extends OrderPizza {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new BeijingCheesePizza();
        }
        else if(type.equals("pepper")){
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
