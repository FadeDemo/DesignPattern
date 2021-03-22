package org.fade.pattern.bp.mediator;

/**
 * 中介者模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator,"alarm");
        Curtain curtain = new Curtain(mediator,"curtain");
        TV tv = new TV(mediator,"TV");
        tv.sendMessage(0);
        alarm.sendMessage(0);
    }

}
