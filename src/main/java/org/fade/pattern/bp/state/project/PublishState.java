package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 已发布状态类
 * @author fade
 * */
public class PublishState extends AbstractState{

    @Override
    public void acceptOrderEvent(Context context) {
        context.setState(new NotPayState());
    }

    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedbackState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }

}
