package org.fade.pattern.sp.decorator.example.good;

/**
 * 适配器模式
 * 例子
 * 较好的方案
 * 咖啡抽象类
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
     * 咖啡中放牛奶的数量
     * */
    private int milk;

    /**
     * 咖啡中放糖的数量
     * */
    private int sugar;

    /**
     * 咖啡中放巧克力的数量
     * */
    private  int chocolate;

    /**
     * field description's getter method
     * @return 咖啡的描述
     * */
    public String getDescription(){
        String description = "喝";
        String temp = "";
        if (this.getMilk()>0){
            temp = "的";
            description += "放了" + this.getMilk() + "勺牛奶";
        }
        if (this.getChocolate()>0){
            temp = "的";
            description += "放了" + this.getChocolate() + "勺巧克力";
        }
        if (this.getSugar()>0){
            temp = "的";
            description += "放了" + this.getSugar() + "勺糖";
        }
        description += temp + this.description + "花了" + this.cost() + "元";
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
     * field milk's getter method
     * @return 放的牛奶数量
     * */
    public int getMilk() {
        return milk;
    }

    /**
     * field milk's setter method
     * @param milk 放的牛奶数量
     * */
    public void setMilk(int milk) {
        this.milk = milk;
    }

    /**
     * field sugar's getter method
     * @return 放的糖数量
     * */
    public int getSugar() {
        return sugar;
    }

    /**
     * field sugar's setter method
     * @param sugar 放的糖数量
     * */
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    /**
     * field chocolate's getter method
     * @return 放的巧克力数量
     * */
    public int getChocolate() {
        return chocolate;
    }

    /**
     * field chocolate's setter method
     * @param chocolate 放的巧克力数量
     * */
    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    /**
     * 计算喝咖啡耗费的金额
     * @return 喝咖啡耗费的金额
     * */
    public abstract float cost();

}
