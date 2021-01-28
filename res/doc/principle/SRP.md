# 单一职责原则

#### 定义

>对类来说，一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2，当职责1需求变更而改变A时，可能照成职责2执行错误，所以需要将类A的粒度分解为A1和A2

#### 例子

```java
class Vehicle{

    /**
     * @param vehicle 交通工具名
     * */
    public void run(String vehicle){
        System.out.println(vehicle+" is running on the road");
    }

}
```

>对于上面的交通工具类来说，它的run方法就违反了单一职责原则。当传入的交通工具是飞机时，很明显飞机时在空中飞的，而不是在地上跑的

###### 改进方法一

```java
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
```

>但是很明显为了每个功能都需要创建一个类，如此开销过大

###### 改进方法二

```java
class Vehicle{

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
```

>该方法类级别上未遵守单一职责原则，方法级别上遵守了单一职责原则

#### [代码](../../../src/main/java/org/fade/principle/srp/SRP.java)