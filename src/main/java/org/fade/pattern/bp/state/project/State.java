package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 状态抽象类
 * @author fade
 * */
public interface State {

    void checkEvent(Context context);

    void checkFailEvent(Context context);

    void makePriceEvent(Context context);

    void acceptOrderEvent(Context context);

    void notPeopleAcceptEvent(Context context);

    void payOrderEvent(Context context);

    void orderFailureEvent(Context context);

    void feedBackEvent(Context context);

}
