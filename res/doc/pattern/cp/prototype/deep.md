# 对于浅拷贝问题的解决（深拷贝）

#### 深拷贝定义

>不仅复制对象所有基本数据类型的成员变量值，还为所有引用数据类型的成员变量申请存储空间，并复制每个引用类型变量所引用的对象，直到该对象可达所有的对象。这时候对一个对象的引用类型成员变量进行修改并不会影响拷贝出来的对象的引用类型成员变量。

#### 例子

>还是克隆羊的例子，[具体参考](prototype.md#例子)

>这里仍有一个引用类型成员变量，但是为了便于实现，这里引用变量的类型是Birthday，而不是Sheep。

#### [代码](../../../../../src/main/java/org/fade/pattern/cp/prototype/deep)

```java
public class Sheep implements Cloneable, Serializable {

    private String name;

    private int age;

    private String color;

    private Birthday birthday;

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

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 重写clone()方法
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Sheep sheep = (Sheep)object;
        Birthday birthday = sheep.getBirthday();
        sheep.setBirthday((Birthday) birthday.clone());
        return sheep;
    }

    /**
     * 对象序列化与反序列化方法
     * */
    public Object deepClone(){
        Object object;
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            out = new ObjectOutputStream(bao);
            out.writeObject(this);
            in = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
            object = in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            object = null;
        }finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;
    }

}
```

```java
public class Birthday implements Cloneable, Serializable {

    private int year;

    private int month;

    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
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
        prototype.setBirthday(new Birthday(1949,10,1));
        System.out.println("prototype:"+prototype.toString());
        try {
            Sheep clone1 = (Sheep) prototype.clone();
            System.out.println("重写clone()："+clone1.toString());
            System.out.println(prototype==clone1);
            System.out.println(prototype.getBirthday()==clone1.getBirthday());
            Sheep clone2 = (Sheep) prototype.deepClone();
            System.out.println("对象序列化与反序列化："+clone2.toString());
            System.out.println(prototype==clone2);
            System.out.println(prototype.getBirthday()==clone2.getBirthday());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
```

#### 运行结果

```
prototype:Sheep{name='Tom', age=1, color='white'}
重写clone()：Sheep{name='Tom', age=1, color='white'}
false
false
对象序列化与反序列化：Sheep{name='Tom', age=1, color='white'}
false
false
```

#### 总结

>从结果中可以知道，我们实现深拷贝后，引用类型的成员变量便不再指向同一个对象；而且可以知道的是，要想实现深拷贝有两种基本方式。

###### 实现深拷贝的两种基本方式

* ###### 重写clone()方法

>对基本数据类型的成员变量仍旧使用super.clone()方法克隆；对引用类型变量（如果类型不是自身，比如Sheep类里有一个Sheep类型的变量），可以调用该类的clone()方法克隆（前提是该类必须实现Cloneable接口并重写clone()方法）。

* ###### 对象的序列化与反序列化

>类本身及引用类型成员变量的类都要实现Serializable接口，然后通过ObjectInputStream和ObjectOutputStream进行IO读写完成。

