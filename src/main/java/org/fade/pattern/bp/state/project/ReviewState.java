package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 已审核状态类
 * @author fade
 * */
public class ReviewState extends AbstractState {

    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }

    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }

}
