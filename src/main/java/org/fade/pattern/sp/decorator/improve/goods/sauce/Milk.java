package org.fade.pattern.sp.decorator.improve.goods.sauce;

import org.fade.pattern.sp.decorator.improve.goods.Goods;

/**
 * 装饰器模式
 * 改进
 * 牛奶（装饰者）
 * @author fade
 * */
public class Milk extends Decorator {

    /**
     * Constructor of Milk
     * @param goods 单品咖啡
     * @param price 牛奶的价格
     * */
    public Milk(Goods goods, float price){
        super(goods);
        super.setDescription("牛奶");
        super.setPrice(price);
    }

}
