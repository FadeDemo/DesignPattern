package org.fade.pattern.factory.simple;

import org.fade.pattern.factory.example.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 工厂模式
 * 简单工厂模式
 * @author fade
 * */
public class OrderPizza {

    /**
     * 简单工厂对象
     * */
    private SimpleFactory simpleFactory;

    private Pizza pizza;

    public OrderPizza(SimpleFactory simpleFactory){
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        String type;
        this.simpleFactory = simpleFactory;
        do {
            type = getType();
            this.pizza = this.simpleFactory.createPizza(type);
            if (this.pizza!=null){
                System.out.println("Pizza订购成功");
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else{
                System.out.println("Pizza订购失败");
                break;
            }
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
