package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 状态抽象类
 * @author fade
 * */
public abstract class AbstractState implements State {

    protected static final RuntimeException EXCEPTION = new RuntimeException();

    /**
     * 电审
     *
     * @param context
     */
    @Override
    public void checkEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 电审失败
     *
     * @param context
     */
    @Override
    public void checkFailEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 定价发布
     *
     * @param context
     */
    @Override
    public void makePriceEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 接单
     *
     * @param context
     */
    @Override
    public void acceptOrderEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 无人接单失效
     *
     * @param context
     */
    @Override
    public void notPeopleAcceptEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 付款
     *
     * @param context
     */
    @Override
    public void payOrderEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 接单有人支付失效
     *
     * @param context
     */
    @Override
    public void orderFailureEvent(Context context) {
        throw EXCEPTION;
    }

    /**
     * 反馈
     *
     * @param context
     */
    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }

}
