package org.fade.pattern.sp.decorator.example.bad;

/**
 * 装饰器模式
 * 例子
 * 较差的方案
 * 牛奶浓缩咖啡
 * @author fade
 * */
public class MilkEspresso extends Coffee {

    /**
     * Constructor of MilkEspresso
     * @param price 牛奶浓缩咖啡的价格
     * */
    public MilkEspresso(float price){
        super();
        super.setDescription("牛奶浓缩咖啡");
        super.setPrice(price);
    }

    /**
     * 计算喝咖啡所耗费的金额
     *
     * @return 喝咖啡所耗费的金额
     */
    @Override
    public float cost() {
        return 0;
    }

}
