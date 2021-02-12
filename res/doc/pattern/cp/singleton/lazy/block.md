# 懒汉式(线程不安全，同步代码块)

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

    //1.构造器私有化
    private Singleton(){

    }

    //3.向外提供一个静态的公共方法获取实例对象
    //仅当使用该方法时，才去创建instance
    public static Singleton getInstance() {
        //2.类的内部创建对象
        if (instance == null){
            synchronized (Singleton.class){
                instance = new Singleton();
            }
        }
        return instance;
    }

}
```

#### 优缺点

* ###### 本意上是想要对懒汉式(线程安全，同步方法)单例模式进行改进以提高效率，但实际上并不能起到线程同步的作用，仍是都有可能进入if(instance==null)的代码块中，造成产生多个实例。

#### 结论

>实际开发中**不能使用**这种方式

#### [代码](../../../../../../src/main/java/org/fade/pattern/cp/singleton/lazy/secure/block/BlockExample.java)
