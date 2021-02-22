package org.fade.pattern.sp.decorator.improve;

import org.fade.pattern.sp.decorator.improve.goods.Goods;
import org.fade.pattern.sp.decorator.improve.goods.coffee.LongBlack;
import org.fade.pattern.sp.decorator.improve.goods.sauce.Chocolate;
import org.fade.pattern.sp.decorator.improve.goods.sauce.Milk;

/**
 * 装饰器模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Goods longBlack = new LongBlack(5f);
        System.out.println("喝"+longBlack.getDescription()+"花费了"+longBlack.cost()+"元");
        Goods milkCoffee = new Milk(longBlack,1f);
        System.out.println("喝"+milkCoffee.getDescription()+"花费了"+milkCoffee.cost()+"元");
        Goods chocolateCoffee = new Chocolate(milkCoffee,2f);
        System.out.println("喝"+chocolateCoffee.getDescription()+"花费了"+chocolateCoffee.cost()+"元");
        Goods doubleChocolateCoffee = new Chocolate(chocolateCoffee,2f);
        System.out.println("喝"+doubleChocolateCoffee.getDescription()+"花费了"+doubleChocolateCoffee.cost()+"元");
        System.out.println("*************split*************");
        Goods goods = new Chocolate(new Chocolate(new Milk(new LongBlack(5f),1f),2f),2f);
        System.out.println("喝"+goods.getDescription()+"花费了"+goods.cost()+"元");
    }

}
