# 枚举单例模式

#### 例子

```java
public class EnumerateExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1==instance2);
    }

}

enum Singleton{

    INSTANCE;

}
```

>因为被枚举的成员实际上就是一个枚举类型的实例，且它们默认都是public static final修饰的，所以这种方式可以用来实现单例模式。

#### 优缺点

* ###### 可以避免多线程同步问题，还能防止反序列化重新创建新的对象。

#### 结论

>实际开发中**推荐使用**这种方式

#### [代码](../../../../../src/main/java/org/fade/pattern/singleton/enumerate/EnumerateExample.java)
