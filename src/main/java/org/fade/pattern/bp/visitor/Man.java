package org.fade.pattern.bp.visitor;

/**
 * 访问者模式
 * Man类
 * 具体元素
 * @author fade
 * */
public class Man extends Person{

    /**
     * 接受访问者
     *
     * @param action 访问者
     */
    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
