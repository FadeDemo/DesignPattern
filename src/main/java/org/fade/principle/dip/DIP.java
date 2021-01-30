package org.fade.principle.dip;

/**
 * 依赖倒转原则（违背）
 * @author fade
 * */
public class DIP {

    public static void main(String[] args){
        Person person = new Person();
        person.receive(new Email());
    }

}

/**
 * 缺点：当获取的对象不是Email而是短信或者微信时，需新增类和相应接收方法
 * */
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
