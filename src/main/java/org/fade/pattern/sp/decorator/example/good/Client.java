package org.fade.pattern.sp.decorator.example.good;

/**
 * 适配器模式
 * 例子
 * 较好的方案
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Coffee espresso = new Espresso(5f);
        espresso.setMilk(1);
        espresso.setChocolate(1);
        espresso.setSugar(2);
        System.out.println(espresso.getDescription());
    }

}
