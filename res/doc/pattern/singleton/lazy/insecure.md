# 懒汉式(线程不安全)单例模式

#### 实现步骤

1. ###### 构造器私有化

>构造器私有化是为了防止new

2. ###### 类的内部创建对象

3. ###### 向外提供一个公共静态方法

#### 例子

```java
public class InsecureExample {

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
            instance = new Singleton();
        }
        return instance;
    }

}
```

#### 优缺点

* ###### 起到了Lazy Loading的效果

* ###### 如果在多线程环境下，一个线程进入了if(instance==null)的代码块中，还未来得及向下执行，此时另一个线程也进入了这个代码块，这时便会产生多个实例。所以这种方式在多线程环境下是不安全的。

#### 结论

>实际开发中**不要使用**这种方式

#### [代码](../../../../../src/main/java/org/fade/pattern/singleton/lazy/insecure/InsecureExample.java)
