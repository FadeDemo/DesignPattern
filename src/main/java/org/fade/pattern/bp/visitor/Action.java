package org.fade.pattern.bp.visitor;

/**
 * 访问者模式
 * 抽象行动类
 * 抽象访问者
 * @author fade
 * */
public abstract class Action {

    /**
     * 获得男性评测
     * @param man 男性对象
     * */
    public abstract void getManResult(Man man);

    /**
     * 获得女性评测
     * @param woman 女性对象
     * */
    public abstract void getWomanResult(Woman woman);

}
