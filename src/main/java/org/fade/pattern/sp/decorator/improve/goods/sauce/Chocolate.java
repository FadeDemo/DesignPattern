package org.fade.pattern.sp.decorator.improve.goods.sauce;

import org.fade.pattern.sp.decorator.improve.goods.Goods;

/**
 * 装饰器模式
 * 改进
 * 巧克力（装饰者）
 * @author fade
 * */
public class Chocolate extends Decorator {

    /**
     * Constructor of Chocolate
     * @param goods 单品咖啡
     * @param price 巧克力的价格
     * */
    public Chocolate(Goods goods, float price){
        super(goods);
        super.setDescription("巧克力");
        super.setPrice(price);
    }

}
