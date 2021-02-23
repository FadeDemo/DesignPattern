package org.fade.pattern.sp.decorator.example.bad;

/**
 * 装饰器模式
 * 例子
 * 较差的方案
 * Coffee抽象类
 * @author fade
 * */
public abstract class Coffee {

    /**
     * 咖啡的描述
     * */
    private String description;

    /**
     * 咖啡的价格
     * */
    private float price;

    /**
     * field description's getter method
     * @return 咖啡的描述
     * */
    public String getDescription() {
        return description;
    }

    /**
     * field description's setter method
     * @param description 咖啡的描述
     * */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * field price's getter method
     * @return 咖啡的价格
     * */
    public float getPrice() {
        return price;
    }

    /**
     * field price's setter method
     * @param price 咖啡的价格
     * */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算喝咖啡所耗费的金额
     * @return 喝咖啡所耗费的金额
     * */
    public abstract float cost();

}
