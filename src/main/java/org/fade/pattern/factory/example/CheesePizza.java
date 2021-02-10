package org.fade.pattern.factory.example;

/**
 * 工厂模式
 * 例子
 * @author fade
 * */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare raw materials for CheesePizza");
    }

}
