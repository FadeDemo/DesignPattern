package org.fade.pattern.abstraction;

import org.fade.pattern.factory.example.Pizza;
import org.fade.pattern.factory.method.BeijingCheesePizza;
import org.fade.pattern.factory.method.BeijingPepperPizza;

/**
 * 抽象工厂模式
 * @author fade
 * */
public class BeijingFactory implements AbstractFactory{

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new BeijingCheesePizza();
        }
        else if(type.equals("pepper")){
            pizza = new BeijingPepperPizza();
        }
        return pizza;
    }

}
