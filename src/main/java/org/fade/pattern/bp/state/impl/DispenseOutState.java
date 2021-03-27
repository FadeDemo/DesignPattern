package org.fade.pattern.bp.state.impl;

/**
 * 状态模式
 * 实现
 * 奖品发放完毕状态类
 * @author fade
 * */
public class DispenseOutState implements State {

    private RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("奖品发放完了，请下次再参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发放完了，请下次再参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发放完了，请下次再参加");
    }

}
