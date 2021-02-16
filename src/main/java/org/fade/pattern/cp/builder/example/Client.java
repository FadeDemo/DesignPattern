package org.fade.pattern.cp.builder.example;

/**
 * 建造者模式
 * 例子
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        House commonHouse = new CommonHouse();
        House villa = new Villa();
        commonHouse.build();
        villa.build();
    }

}
