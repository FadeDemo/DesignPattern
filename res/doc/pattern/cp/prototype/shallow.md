# 原型模式下的浅拷贝问题

#### 浅拷贝定义

>对于数据类型是引用数据类型的成员变量，比如说数组等，浅拷贝只是将引用值复制一份给新的对象。实际上两个对象的该成员变量指向同一个实例，当在一个对象中对该成员变量进行修改会影响到另一个对象的成员变量。

#### 例子

>还是克隆羊的例子，[具体参考](prototype.md#例子)

>但是有所不同的是，这里假设羊有一个属性叫作朋友，它的类型也是Sheep，这里我们仍按照默认的clone()方法去进行拷贝。不过拷贝只进行一次，因为这里关注的重点是对于对象类型之类的属性，默认的clone()方法会如何进行拷贝。

#### [代码](../../../../../src/main/java/org/fade/pattern/cp/prototype/shallow)

```java
public class Sheep implements Cloneable {

    private String name;

    private int age;

    private String color;

    private Sheep friend;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
```

```java
public class Client {

    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom",1,"white");
        prototype.setFriend(new Sheep("Kobe",2,"black"));
        try {
            Sheep clone = (Sheep) prototype.clone();
            System.out.println(prototype.toString());
            System.out.println(clone.toString());
            System.out.println(prototype==clone);
            System.out.println(prototype.getFriend()==clone.getFriend());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
```

#### 运行结果

```
Sheep{name='Tom', age=1, color='white'}
Sheep{name='Tom', age=1, color='white'}
false
true
```

#### 总结

>从结果中我们可以知道，对于对象类型之类的属性，在进行默认方式的拷贝时(浅拷贝)，仅会将引用值赋值一份给新创建的对象的引用变量。


