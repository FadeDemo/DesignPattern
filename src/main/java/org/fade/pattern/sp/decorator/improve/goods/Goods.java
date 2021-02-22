package org.fade.pattern.sp.decorator.improve.goods;

/**
 * 装饰器模式
 * 改进
 * 商品抽象类
 * @author fade
 * */
public abstract class Goods {

    /**
     * 描述
     * */
    private String description;

    /**
     * 费用
     * */
    private float price;

    /**
     * field description's getter method
     * @return 商品的描述
     * */
    public String getDescription() {
        return description;
    }

    /**
     * field description's setter method
     * */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * field price's getter method
     * @return 商品的费用
     * */
    public float getPrice() {
        return price;
    }

    /**
     * field description's setter method
     * */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算购买商品的耗费的钱
     * @return 购买商品的耗费的钱
     * */
    public abstract float cost();

}
