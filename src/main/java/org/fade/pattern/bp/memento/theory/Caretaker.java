package org.fade.pattern.bp.memento.theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录模式
 * 原理
 * 负责人
 * @author fade
 * */
public class Caretaker {

    private List<Memento> mementos = new ArrayList<>();

    public void addMemento(Memento memento){
        mementos.add(memento);
    }

    public Memento getMemento(int index){
        return mementos.get(index);
    }

}
