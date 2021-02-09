# 饿汉式(静态代码块)单例模式

#### 实现步骤

1. ###### 构造器私有化

>构造器私有化是为了防止new

2. ###### 类的内部创建对象

3. ###### 向外提供一个公共静态方法

#### 例子

```java
public class BlockExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{


    private static Singleton instance;

    //2.类的内部创建对象
    static {
        instance = new Singleton();
    }

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

* ###### 此方式和饿汉式(静态常量)单例模式其实类似，只不过将类的实例化过程放在了静态代码块中，故它的优缺点也是和饿汉式(静态常量)单例模式是一样的。

#### 结论

>实际开发中**可用**，但可能造成内存浪费

#### [代码](../../../../../src/main/java/org/fade/pattern/singleton/hungry/block/BlockExample.java)
