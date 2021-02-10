# 双重检查单例模式

#### 实现步骤

1. ###### 构造器私有化

>构造器私有化是为了防止new

2. ###### 类的内部创建对象

3. ###### 向外提供一个公共静态方法

#### 例子

```java
public class DCLExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{

    private static volatile Singleton instance;

    //1.构造器私有化
    private Singleton(){

    }

    //3.向外提供一个静态的公共方法获取实例对象
    //仅当使用该方法时，才去创建instance
    public static Singleton getInstance() {
        //2.类的内部创建对象
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
```

>使用volatile关键字是为了让修改后的值强制写入主存，保证了线程间变量的可见性

#### 优缺点

* ###### 解决了线程安全问题，效率也比较高，实现了Lazy Loading的效果。

#### 结论

>实际开发中**推荐使用**这种方式

#### [代码](../../../../../src/main/java/org/fade/pattern/singleton/dcl/DCLExample.java)
