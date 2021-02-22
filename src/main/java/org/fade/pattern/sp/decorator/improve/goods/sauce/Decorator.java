package org.fade.pattern.sp.decorator.improve.goods.sauce;

import org.fade.pattern.sp.decorator.improve.goods.Goods;

/**
 * 装饰器模式
 * 改进
 * 装饰者
 * @author fade
 * */
public class Decorator extends Goods {

    /**
     * 单品咖啡
     * */
    private Goods goods;

    /**
     * Constructor of Decorator
     * @param goods 单品咖啡
     * */
    public Decorator(Goods goods){
        this.goods = goods;
    }

    /**
     * 计算喝咖啡的耗费的钱
     *
     * @return 喝咖啡所耗费的钱
     */
    @Override
    public float cost() {
        //(装饰者)自己的价格+(被装饰者)和单品咖啡耗费的钱
        return super.getPrice() + this.goods.cost();
    }

    /**
     * field description's getter method
     *
     * @return 咖啡的描述
     */
    @Override
    public String getDescription() {
        //(装饰者)自己的描述+(被装饰者)单品咖啡的描述
        return super.getDescription() + "&" + this.goods.getDescription();
    }

}
