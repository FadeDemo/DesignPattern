package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 待付款状态类
 * @author fade
 * */
public class NotPayState extends AbstractState {

    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }

}
