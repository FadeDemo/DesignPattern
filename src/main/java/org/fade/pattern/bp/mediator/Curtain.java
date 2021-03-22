package org.fade.pattern.bp.mediator;

/**
 * 中介者模式
 * 具体同事类
 * @author fade
 * */
public class Curtain extends Colleague {

    public Curtain(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.getName());
    }

    public void upCurtain(){
        System.out.println("正在升起窗帘!");
    }

}
