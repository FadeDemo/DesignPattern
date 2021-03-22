package org.fade.pattern.bp.mediator;

/**
 * 中介者模式
 * 抽象同事类
 * @author fade
 * */
public abstract class Colleague {

    private Mediator mediator;

    private String name;

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage(int stateChange);

}
