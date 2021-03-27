package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 已完结状态类
 * @author fade
 * */
public class FeedbackState extends AbstractState {

    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }

}
