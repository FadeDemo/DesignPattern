package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * Context类
 * @author fade
 * */
public class Context extends AbstractState {

    private State state;

    @Override
    public void checkEvent(Context context) {
        state.checkEvent(this);
        this.getCurrentState();
    }

    @Override
    public void checkFailEvent(Context context) {
        state.checkFailEvent(this);
        this.getCurrentState();
    }

    @Override
    public void makePriceEvent(Context context) {
        state.makePriceEvent(this);
        this.getCurrentState();
    }

    @Override
    public void acceptOrderEvent(Context context) {
        state.acceptOrderEvent(this);
        this.getCurrentState();
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        state.notPeopleAcceptEvent(this);
        this.getCurrentState();
    }

    @Override
    public void payOrderEvent(Context context) {
        state.payOrderEvent(this);
        this.getCurrentState();
    }

    @Override
    public void orderFailureEvent(Context context) {
        state.orderFailureEvent(this);
        this.getCurrentState();
    }

    @Override
    public void feedBackEvent(Context context) {
        state.feedBackEvent(this);
        this.getCurrentState();
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String getCurrentState() {
        System.out.println("当前状态为："+state.getCurrentState());
        return state.getCurrentState();
    }

}
