package org.fade.pattern.bp.mediator;

/**
 * 中介者模式
 * 具体同事类
 * @author fade
 * */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name,this);
    }

    @Override
    public void sendMessage(int stateChange) {
        this.getMediator().getMessage(stateChange,this.getName());
    }

    public void startTV(){
        System.out.println("打开电视!");
    }

    public void stopTV(){
        System.out.println("关掉电视!");
    }

}
