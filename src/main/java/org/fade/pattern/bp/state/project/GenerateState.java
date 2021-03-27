package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 订单生成状态类
 * @author fade
 * */
public class GenerateState extends AbstractState {

    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }

    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }

}
