package org.fade.pattern.sp.decorator.example.bad;

/**
 * 装饰器模式
 * 例子
 * 较差的方案
 * 短咖啡
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

    /**
     * 计算喝咖啡所耗费的金额
     *
     * @return 喝咖啡所耗费的金额
     */
    @Override
    public float cost() {
        return super.getPrice();
    }

}
