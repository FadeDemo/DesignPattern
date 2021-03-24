package org.fade.pattern.bp.memento.impl;

/**
 * 备忘录模式
 * 实现
 * 负责人
 * @author fade
 * */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
