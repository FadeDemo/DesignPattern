package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 已付款状态类
 * @author fade
 * */
public class PaidState extends AbstractState {

    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }

}
