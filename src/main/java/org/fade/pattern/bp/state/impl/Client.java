package org.fade.pattern.bp.state.impl;

/**
 * 状态模式
 * 实现
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        RaffleActivity activity = new RaffleActivity(1);
        for (int i = 0;i<50;i++){
            System.out.println("--------第"+(i+1)+"次抽奖--------");
            activity.deductMoney();
            activity.raffle();
        }
    }

}
