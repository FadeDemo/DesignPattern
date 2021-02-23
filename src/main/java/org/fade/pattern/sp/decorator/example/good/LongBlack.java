package org.fade.pattern.sp.decorator.example.good;

/**
 * 适配器模式
 * 例子
 * 较好的方案
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
