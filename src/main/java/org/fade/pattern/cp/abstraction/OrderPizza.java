package org.fade.pattern.cp.abstraction;

import org.fade.pattern.cp.factory.example.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 抽象工厂模式
 * @author fade
 * */
public class OrderPizza {

    private AbstractFactory factory;

    public OrderPizza(){

    }

    public void setFactory(AbstractFactory factory) {
        this.factory = factory;
        Pizza pizza;
        String type;
        do {
            type = getType();
            pizza = factory.createPizza(type);
            if (pizza==null){
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
