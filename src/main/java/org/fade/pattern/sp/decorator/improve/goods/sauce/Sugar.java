package org.fade.pattern.sp.decorator.improve.goods.sauce;

import org.fade.pattern.sp.decorator.improve.goods.Goods;

/**
 * 装饰器模式
 * 改进
 * 糖（装饰者）
 * @author fade
 * */
public class Sugar extends Decorator {

    /**
     * Constructor of Sugar
     * @param goods 单品咖啡
     * @param price 糖的价格
     * */
    public Sugar(Goods goods,float price){
        super(goods);
        super.setDescription("糖");
        super.setPrice(price);
    }

}
