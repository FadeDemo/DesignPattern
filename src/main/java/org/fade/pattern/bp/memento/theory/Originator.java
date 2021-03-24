package org.fade.pattern.bp.memento.theory;

/**
 * 备忘录模式
 * 原理
 * 原发器
 * @author fade
 * */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(this.state);
    }

    public void recoverState(Memento memento){
        this.state = memento.getState();
    }

}
