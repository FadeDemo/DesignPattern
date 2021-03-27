package org.fade.pattern.bp.state.impl;

/**
 * 状态模式
 * 实现
 * 抽象状态类
 * @author fade
 * */
public interface State {

    void deductMoney();

    boolean raffle();

    void dispensePrize();

}
