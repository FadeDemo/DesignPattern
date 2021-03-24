package org.fade.pattern.bp.memento.theory;

/**
 * 备忘录模式
 * 原理
 * 备忘录
 * @author fade
 * */
public class Memento {

    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
