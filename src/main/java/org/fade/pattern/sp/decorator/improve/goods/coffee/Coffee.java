package org.fade.pattern.sp.decorator.improve.goods.coffee;

import org.fade.pattern.sp.decorator.improve.goods.Goods;

/**
 * 装饰器模式
 * 改进
 * 咖啡
 * @author fade
 * */
public class Coffee extends Goods {

    /**
     * 计算喝咖啡的耗费的钱
     *
     * @return 喝咖啡所耗费的钱
     */
    @Override
    public float cost() {
        return super.getPrice();
    }

}
