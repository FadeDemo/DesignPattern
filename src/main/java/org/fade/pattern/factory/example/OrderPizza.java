package org.fade.pattern.factory.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂模式
 * 例子
 * @author fade
 * */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza;
        String type;
        do {
            type = getType();
            if (type.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("GreekPizza");
            }
            else if (type.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("CheesePizza");
            }
//            else if (type.equals("pepper")){
//                pizza = new PepperPizza();
//                pizza.setName("PepperPizza");
//            }
            else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    private String getType(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please input pizza type:");
        String type;
        try {
            type = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            type = "";
        }
        return type;
    }

}
