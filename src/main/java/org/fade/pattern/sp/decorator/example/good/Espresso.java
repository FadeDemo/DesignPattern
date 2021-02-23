package org.fade.pattern.sp.decorator.example.good;

/**
 * 适配器模式
 * 例子
 * 较好的方案
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

    /**
     * 计算喝咖啡耗费的金额
     *
     * @return 喝咖啡耗费的金额
     */
    @Override
    public float cost() {
        return super.getPrice()+super.getMilk()*2f+super.getChocolate()*2.5f+super.getSugar()*1f;
    }

}
