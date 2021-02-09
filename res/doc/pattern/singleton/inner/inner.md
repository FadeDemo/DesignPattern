# 静态内部类单例模式

#### 实现步骤

1. ###### 构造器私有化

>构造器私有化是为了防止new

2. ###### 类的内部创建对象

3. ###### 向外提供一个公共静态方法

#### 例子

>代码

```java
public class InnerExample {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1==instance2);
    }

}

class Singleton{

    //1.构造器私有化
    private Singleton(){

    }

    private static class SingletonInstance{

        static {
            System.out.println("Class is loading");
        }

        //2.类的内部创建对象
        private static final Singleton instance = new Singleton();

    }

    public static Singleton getInstance(){
        System.out.println("开始调用静态内部类");
        return SingletonInstance.instance;
    }

}
```

>运行结果

```
开始调用静态内部类
Class is loading
开始调用静态内部类
true
```

>外部类被加载时静态内部类并未被加载，由运行结果也可以知道，程序是在调用getInstance()方法输出“开始调用静态内部类”才执行静态代码块里的输出语句；并且JVM保证了在类装载的时候是线程安全的。

#### 优缺点

* ###### 线程安全，效率高，可以实现Lazy Loading的效果。

#### 结论

>实际开发中**推荐使用**这种方式

#### [代码](../../../../../src/main/java/org/fade/pattern/singleton/inner/InnerExample.java)
