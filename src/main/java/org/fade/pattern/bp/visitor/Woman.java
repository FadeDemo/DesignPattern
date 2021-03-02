package org.fade.pattern.bp.visitor;

/**
 * 访问者模式
 * Woman类
 * 具体元素
 * @author fade
 * */
public class Woman extends Person{

    /**
     * 接受访问者
     *
     * @param action 访问者
     */
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }

}
