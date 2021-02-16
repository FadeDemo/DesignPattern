package org.fade.pattern.cp.builder.example;

/**
 * 建造者模式
 * 例子
 * 普通房子
 * @author fade
 * */
public class CommonHouse extends House {

    @Override
    public void layFoundation() {
        System.out.println("正在为普通房子打地基......");
    }

    @Override
    public void buildWall() {
        System.out.println("正在为普通房子砌墙......");
    }

    @Override
    public void buildRoof() {
        System.out.println("正在为普通房子封顶......");
    }

}
