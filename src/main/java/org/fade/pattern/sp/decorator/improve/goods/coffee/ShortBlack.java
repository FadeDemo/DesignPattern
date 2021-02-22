package org.fade.pattern.sp.decorator.improve.goods.coffee;

/**
 * 装饰器模式
 * 改进
 * 短咖啡？
 * @author fade
 * */
public class ShortBlack extends Coffee {

    /**
     * Constructor of ShortBlack
     * @param price 短咖啡的价格
     * */
    public ShortBlack(float price){
        super();
        super.setDescription("短咖啡");
        super.setPrice(price);
    }

}
