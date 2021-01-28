package org.fade.principle.srp;

/**
 * 单一职责原则
 * @author fade
 * */
public class SRP {

    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        vehicle.run("Motorbike");
        vehicle.run("Car");
        vehicle.run("Plane");
        //Motorbike is running on the road
        //Car is running on the road
        //Plane is running on the road ??
        System.out.println("**********split**********");
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("Motorbike");
        roadVehicle.run("Car");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("Plane");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("Boat");
        System.out.println("**********split**********");
        vehicle.runRoad("Motorbike");
        vehicle.runRoad("Car");
        vehicle.runAir("Plane");
        vehicle.runWater("Boat");
    }

}

//方案一
//不遵循单一职责原则
/**
 * 交通工具类
 * run method违反了单一职责原则
 * */
class Vehicle{

    /**
     * @param vehicle 交通工具名
     * */
    public void run(String vehicle){
        System.out.println(vehicle+" is running on the road");
    }

    /**
     * @param vehicle 交通工具名
     * */
    public void runRoad(String vehicle){
        System.out.println(vehicle+" is running on the road");
    }

    /**
     * @param vehicle 交通工具名
     * */
    public void runAir(String vehicle){
        System.out.println(vehicle+" is running in the air");
    }

    /**
     * @param vehicle 交通工具名
     * */
    public void runWater(String vehicle){
        System.out.println(vehicle+" is running in the water");
    }

}

//方案二
//遵循了单一职责原则
//但是开销大
/**
 * 路上跑的交通工具
 * */
class RoadVehicle{

    /**
     * @param vehicle 交通工具名
     * */
    public void run(String vehicle){
        System.out.println(vehicle+" is running on the road");
    }

}

/**
 * 空中飞的交通工具
 * */
class AirVehicle{

    /**
     * @param vehicle 交通工具名
     * */
    public void run(String vehicle){
        System.out.println(vehicle+" is flying in the air");
    }

}

/**
 * 水上跑的交通工具
 * */
class WaterVehicle{

    public void run(String vehicle){
        System.out.println(vehicle+" is running in the water");
    }

}

//方案三
//把Vehicle类中run方法分开
//详情参考代码
//类级别上未遵守单一职责原则，方法级别上遵守了单一职责原则