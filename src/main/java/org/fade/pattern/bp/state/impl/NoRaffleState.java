package org.fade.pattern.bp.state.impl;

/**
 * 状态模式
 * 实现
 * 不能抽奖状态类
 * @author fade
 * */
public class NoRaffleState implements State {

    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖！");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("不能发放奖品");
    }

}
