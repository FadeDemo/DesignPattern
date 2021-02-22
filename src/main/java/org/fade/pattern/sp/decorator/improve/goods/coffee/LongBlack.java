package org.fade.pattern.sp.decorator.improve.goods.coffee;

/**
 * 装饰器模式
 * 改进
 * 长咖啡
 * @author fade
 * */
public class LongBlack extends Coffee {

    /**
     * Constructor of LongBlack
     * @param price 长咖啡的价格
     * */
    public LongBlack(float price){
        super();
        super.setDescription("长咖啡");
        super.setPrice(price);
    }

}
