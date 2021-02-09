# 饿汉式(静态常量)单例模式

#### 实现步骤

1. ###### 构造器私有化

>构造器私有化是为了防止new

2. ###### 类的内部创建对象

3. ###### 向外提供一个公共静态方法

#### 例子

```java
public class ConstantExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{

    //2.类的内部创建对象
    private static final Singleton instance = new Singleton();

    //1.构造器私有化
    private Singleton(){

    }

    //3.向外提供一个静态的公共方法获取实例对象
    public static Singleton getInstance() {
        return instance;
    }

}
```

#### 优缺点

* ###### 写法比较简单，在类装载的时候就可以完成实例化，避免了线程同步问题。

* ###### 导致类装载的原因有很多，这就有可能导致并未在真正需要数据的时候，才执行数据加载操作，没有达到Lazy Loading的效果；如果从始至终未使用过这个实例，则会造成内存浪费。

#### 结论

>实际开发中**可用**，但可能造成内存浪费

#### [代码](../../../../../src/main/java/org/fade/pattern/singleton/hungry/constant/ConstantExample.java)
