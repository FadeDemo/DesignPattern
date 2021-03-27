package org.fade.pattern.bp.state.project;

/**
 * 状态模式
 * 项目
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new PublishState());
        context.acceptOrderEvent(context);
        context.payOrderEvent(context);
        try {
            context.checkFailEvent(context);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
