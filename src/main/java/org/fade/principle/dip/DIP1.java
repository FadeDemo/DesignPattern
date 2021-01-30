package org.fade.principle.dip;

/**
 * 依赖倒转原则（遵循）
 * 通过接口进行依赖传递
 * @author fade
 * */
public class DIP1 {

    public static void main(String[] args){
        Person1 person = new Person1();
        person.receive(new Email1());
        person.receive(new WeChat());
    }

}

/**
 * 此时Person类并不需要增加相应的接受方法
 * */
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