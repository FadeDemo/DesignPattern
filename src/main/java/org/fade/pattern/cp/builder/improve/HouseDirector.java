package org.fade.pattern.cp.builder.improve;

/**
 * 建造者模式
 * 改进
 * Director
 * @author fade
 * */
public class HouseDirector {

    private HouseBuilder builder;

    public HouseBuilder getBuilder() {
        return builder;
    }

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public House build(){
        this.builder.layFoundation();
        System.out.println(this.builder.getHouse().toString());
        this.builder.buildWall();
        System.out.println(this.builder.getHouse().toString());
        this.builder.buildRoof();
        return builder.getHouse();
    }

}
