package org.fade.pattern.sp.decorator.example.bad;

/**
 * 适配器模式
 * 例子
 * 较差的方案
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Coffee espresso = new Espresso(5f);
        System.out.println("喝"+espresso.getDescription()+"花费了"+espresso.getPrice());
        Coffee milkEspresso = new MilkEspresso(6f);
        System.out.println("喝"+milkEspresso.getDescription()+"花费了"+milkEspresso.getPrice());
    }

}
