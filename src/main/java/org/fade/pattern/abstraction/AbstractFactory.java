package org.fade.pattern.abstraction;

import org.fade.pattern.factory.example.Pizza;

/**
 * 抽象工厂模式
 * @author fade
 * */
public interface AbstractFactory {

    Pizza createPizza(String type);

}
