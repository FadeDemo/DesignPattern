package org.fade.pattern.factory.method;

import org.fade.pattern.factory.example.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂模式
 * 工厂方法模式
 * @author fade
 * */
public abstract class OrderPizza {

    public OrderPizza(){
        Pizza pizza;
        String type;
        do{
            type = this.getType();
            pizza = this.createPizza(type);
            if(pizza==null){
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    /**
     * 定义创建对象的抽象方法
     * @param type Pizza种类
     * @return Pizza
     * */
    public abstract Pizza createPizza(String type);

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
