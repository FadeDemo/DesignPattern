package org.fade.pattern.sp.adapter.mvc.adapter;

import org.fade.pattern.sp.adapter.mvc.controller.HttpController;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * HttpHandlerAdapter
 * @author fade
 * */
public class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }

}
