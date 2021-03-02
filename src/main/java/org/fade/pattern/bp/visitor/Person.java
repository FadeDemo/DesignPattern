package org.fade.pattern.bp.visitor;

/**
 * 访问者模式
 * Person类
 * 抽象元素
 * @author fade
 * */
public abstract class Person {

    /**
     * 接受访问者
     * @param action 访问者
     * */
    public abstract void accept(Action action);

}
