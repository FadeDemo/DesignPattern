package org.fade.pattern.cp.builder.improve;

/**
 * 建造者模式
 * 改进
 * 抽象的Builder
 * @author fade
 * */
public abstract class HouseBuilder {

    protected House house = new House();

    public abstract void layFoundation();

    public abstract void buildWall();

    public abstract void buildRoof();

    public House getHouse(){
        return this.house;
    }

}
