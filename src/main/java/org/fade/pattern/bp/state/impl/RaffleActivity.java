package org.fade.pattern.bp.state.impl;

/**
 * 状态模式
 * 实现
 * Context类
 * @author fade
 * */
public class RaffleActivity {

    private State state;

    private int count;

    private State noRaffleState = new NoRaffleState(this);

    private State canRaffleState = new CanRaffleState(this);

    private State dispenseState = new DispenseState(this);

    private State dispenseOutState = new DispenseOutState(this);

    public RaffleActivity(int count){
        this.state = this.getNoRaffleState();
        this.count = count;
    }

    public void deductMoney(){
        state.deductMoney();
    }

    public void raffle(){
        if (state.raffle()){
            state.dispensePrize();
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int currentCount = this.count;
        count--;
        return currentCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

}
