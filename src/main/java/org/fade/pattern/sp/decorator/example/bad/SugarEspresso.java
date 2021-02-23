package org.fade.pattern.sp.decorator.example.bad;

/**
 * 适配器模式
 * 例子
 * 较差的方案
 * 放了糖的浓缩咖啡
 * @author fade
 * */
public class SugarEspresso extends Coffee {

    public SugarEspresso(float price){
        super();
        super.setDescription("放了糖的浓缩咖啡");
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
