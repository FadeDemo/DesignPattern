package org.fade.pattern.sp.adapter.mvc.adapter;

import org.fade.pattern.sp.adapter.mvc.controller.SimpleController;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * SimpleHandlerAdapter
 * @author fade
 * */
public class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }

}
