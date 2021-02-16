# 建造者模式

#### 定义

>又叫生成器模式，可以将复杂对象的建造过程抽象出来，使这个抽象过程的不同实现方法可以构造出不同属性的对象。它允许用户只指定复杂对象的类型和内容就可以构建，而不需要知道内部的具体构建细节。

#### 例子

>盖房子这一需求的流程是：打地基、砌墙和封顶。

>但是房子的类型是有很多种的，比如：普通房子、高楼和别墅等。这些种类的房子虽然建造过程是一样的，但是过程中的每个步骤的要求是不尽相同的。

#### 传统方式

###### UML类图

![example.png](../../../../img/pattern/cp/builder/example.png)

###### [代码](../../../../../src/main/java/org/fade/pattern/cp/builder/example)

```java
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
```

```java
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
```

```java
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
```

```java
public class Client {

    public static void main(String[] args) {
        House commonHouse = new CommonHouse();
        House villa = new Villa();
        commonHouse.build();
        villa.build();
    }

}
```

###### 分析

* ###### 优点是比较好理解，且简单易操作

* ###### 缺点是过于简单，把产品和创建产品的过程封装在一起了，增强了耦合性，程序的维护和扩展也不方便

#### 建造者模式中的四种角色

* ###### Product

>具体的产品对象

* ###### Builder

>创建Product对象各个部件指定的抽象层（接口/抽象类）

* ###### ConcreteBuilder

>实现Builder，具体创建Product的层次

* ###### Director

>构建一个使用Builder的对象，用于隔离客户和对象的生产过程，也负责控制Product的生产过程

#### 原理类图

![builder.jpg](../../../../img/pattern/cp/builder/builder.jpg)


