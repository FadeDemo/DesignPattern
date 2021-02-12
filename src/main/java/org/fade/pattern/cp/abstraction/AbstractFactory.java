package org.fade.pattern.cp.abstraction;

import org.fade.pattern.cp.factory.example.Pizza;

/**
 * 抽象工厂模式
 * @author fade
 * */
public interface AbstractFactory {

    Pizza createPizza(String type);

}
