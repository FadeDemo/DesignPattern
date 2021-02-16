package org.fade.pattern.cp.builder.improve;

/**
 * 建造者模式
 * 改进
 * 具体的ConcreteBuilder
 * @author fade
 * */
public class CommonHouseBuilder extends HouseBuilder {

    @Override
    public void layFoundation() {
        System.out.println("正在为普通房子打地基......");
        super.house.setLayFoundation(true);
    }

    @Override
    public void buildWall() {
        System.out.println("正在为普通房子砌墙......");
        super.house.setBuildWall(true);
    }

    @Override
    public void buildRoof() {
        System.out.println("正在为普通房子封顶......");
        super.house.setBuildRoof(true);
    }

}
