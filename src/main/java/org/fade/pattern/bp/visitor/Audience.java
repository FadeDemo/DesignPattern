package org.fade.pattern.bp.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 访问者模式
 * 听众
 * 数据结构
 * @author fade
 * */
public class Audience {

    private List<Person> people = new LinkedList<>();

    public void attach(Person person){
        this.people.add(person);
    }

    public void detach(Person person){
        this.people.remove(person);
    }

    public void display(Action action){
        for (Person person:this.people){
            person.accept(action);
        }
    }

}
