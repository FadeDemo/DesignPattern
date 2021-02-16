package org.fade.pattern.cp.builder.example;

/**
 * 建造者模式
 * 例子
 * 别墅
 * @author fade
 * */
public class Villa extends House {

    @Override
    public void layFoundation() {
        System.out.println("正在为别墅打地基......");
    }

    @Override
    public void buildWall() {
        System.out.println("正在为别墅砌墙......");
    }

    @Override
    public void buildRoof() {
        System.out.println("正在为别墅封顶......");
    }

}
