# 依赖倒转原则

#### 定义

>* 高层模块不应该依赖底层模块，两者都应该依赖抽象接口
>* 抽象接口不应该依赖于具体实现。而具体实现则应该依赖于抽象接口

#### 中心思想

>面向接口编程

#### 例子

```java
class Person{

    public void receive(Email email){
        System.out.println(email.getInfo());
    }

}

class Email{

    public String getInfo(){
        return "Message from Email!";
    }

}
```

>上面的代码很明显有缺点：当获取的对象不是Email而是短信或者微信时，需新增类和相应接收方法

#### 依赖关系传递的三种方式

>* 接口传递
>* 构造方法传递
>* setter方法传递

###### 接口传递

```java
interface IReceiver{

    String getInfo();

}

class Email1 implements IReceiver{

    public String getInfo(){
        return "Message from Email!";
    }

}

class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "Message from WeChat!";
    }
}

class Person1{

    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }

}
```

###### 构造方法传递

```java
interface IOpenAndClose{

    void open();

}

interface ITV{

    void play();

}

class OpenAndClose implements IOpenAndClose{

    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }

}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("打开了长虹电视机");
    }

}

class Sony implements ITV{

    @Override
    public void play() {
        System.out.println("打开了索尼电视机");
    }

}
```

###### setter方法传递

```java
interface IOpenAndClose1{

    void open();

    void setTV(ITV tv);

}

//下列代码已在DIP2.java存在
//interface ITV{
//
//    void play();
//
//}

class OpenAndClose1 implements IOpenAndClose1{

    private ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTV(ITV tv) {
        this.tv = tv;
    }

}

//下列代码已在DIP2.java存在
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("打开了长虹电视机");
//    }
//
//}
//
//class Sony implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("打开了索尼电视机");
//    }
//
//}
```

>很明显以上三种方法传递依赖没有未被依赖倒置原则，所以当需求发生变动时，客户端并没有作多大的改动

#### 代码

###### [违反依赖倒置原则](../../../src/main/java/org/fade/principle/dip/DIP.java)

###### [接口传递](../../../src/main/java/org/fade/principle/dip/DIP1.java)

###### [构造方法传递](../../../src/main/java/org/fade/principle/dip/DIP2.java)

###### [setter方法传递](../../../src/main/java/org/fade/principle/dip/DIP3.java)

