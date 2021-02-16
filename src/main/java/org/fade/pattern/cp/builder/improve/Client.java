package org.fade.pattern.cp.builder.improve;

/**
 * 建造者模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        CommonHouseBuilder commonHouseBuilder = new CommonHouseBuilder();
        VillaBuilder villaBuilder = new VillaBuilder();
        HouseDirector director = new HouseDirector();
        System.out.println(commonHouseBuilder.getHouse().toString());
        director.setBuilder(commonHouseBuilder);
        director.build();
        System.out.println(commonHouseBuilder.getHouse().toString());
        System.out.println("**********************split**********************");
        System.out.println(villaBuilder.getHouse().toString());
        director.setBuilder(villaBuilder);
        director.build();
        System.out.println(villaBuilder.getHouse().toString());
    }

}
