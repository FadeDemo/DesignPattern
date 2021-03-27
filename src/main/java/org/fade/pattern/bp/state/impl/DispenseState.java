package org.fade.pattern.bp.state.impl;

/**
 * 状态模式
 * 实现
 * 发放奖品状态类
 * @author fade
 * */
public class DispenseState implements State {

    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount()>0){
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRaffleState());
        }
        else {
            System.out.println("很遗憾，奖品发送完了");
            activity.setState(activity.getDispenseOutState());
            System.exit(0);
        }
    }

}
