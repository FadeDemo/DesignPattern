package org.fade.pattern.cp.builder.example;

/**
 * 建造者模式
 * 例子
 * 房子抽象类
 * @author fade
 * */
public abstract class House {

    public abstract void layFoundation();

    public abstract void buildWall();

    public abstract void buildRoof();

    public void build(){
        this.layFoundation();
        this.buildWall();
        this.buildRoof();
    }

}
