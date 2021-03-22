package org.fade.pattern.bp.mediator;

/**
 * 中介者模式
 * 抽象中介者
 * @author fade
 * */
public abstract class Mediator {

    public abstract void register(String colleagueName,Colleague colleague);

    public abstract void getMessage(int stateChange,String colleagueName);

}
