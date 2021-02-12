package org.fade.pattern.cp.abstraction;

import org.fade.pattern.cp.factory.example.Pizza;
import org.fade.pattern.cp.factory.method.BeijingCheesePizza;
import org.fade.pattern.cp.factory.method.BeijingPepperPizza;

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
