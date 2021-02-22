package org.fade.pattern.sp.decorator.improve.goods.coffee;

/**
 * 装饰器模式
 * 改进
 * 浓缩咖啡
 * @author fade
 * */
public class Espresso extends Coffee {

    /**
     * Constructor of Espresso
     * @param price 浓缩咖啡的价格
     * */
    public Espresso(float price){
        super();
        super.setDescription("浓缩咖啡");
        super.setPrice(price);
    }

}
