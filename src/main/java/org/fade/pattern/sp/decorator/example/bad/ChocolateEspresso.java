package org.fade.pattern.sp.decorator.example.bad;

/**
 * 装饰器模式
 * 例子
 * 较差的方案
 * 放了巧克力的浓缩咖啡
 * @author fade
 * */
public class ChocolateEspresso extends Coffee {

    /**
     * Constructor of ChocolateEspresso
     * @param price 放了巧克力的浓缩咖啡价格
     * */
    public ChocolateEspresso(float price){
        super();
        super.setDescription("放了巧克力的浓缩咖啡");
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
