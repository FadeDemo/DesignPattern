package org.fade.pattern.cp.factory.simple;

import org.fade.pattern.cp.factory.example.CheesePizza;
import org.fade.pattern.cp.factory.example.GreekPizza;
import org.fade.pattern.cp.factory.example.PepperPizza;
import org.fade.pattern.cp.factory.example.Pizza;

/**
 * 工厂模式
 * 简单工厂模式
 * @author fade
 * */
public class SimpleFactory {

    /**
     * 根据type返回对应的Pizza实例
     * @param type Pizza type
     * @return Pizza
     * */
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("GreekPizza");
        }
        else if (type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("CheesePizza");
        }
        else if (type.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("PepperPizza");
        }
        return pizza;
    }

}
