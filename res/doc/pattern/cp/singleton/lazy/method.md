# 懒汉式(线程安全，同步方法)单例模式

#### 实现步骤

1. ###### 构造器私有化

>构造器私有化是为了防止new

2. ###### 类的内部创建对象

3. ###### 向外提供一个公共静态方法

#### 例子

```java
public class MethodExample {

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
    public static synchronized Singleton getInstance() {
        //2.类的内部创建对象
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
```

#### 优缺点

* ###### 解决了线程不安全问题

* ###### 对方法进行同步所带来的效率低下

#### 结论

>实际开发中**不推荐使用**这种方式

#### [代码](../../../../../../src/main/java/org/fade/pattern/cp/singleton/lazy/secure/method/MethodExample.java)
