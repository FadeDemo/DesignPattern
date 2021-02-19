package org.fade.pattern.sp.adapter.mvc.adapter;

import org.fade.pattern.sp.adapter.mvc.controller.AnnotationController;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * AnnotationHandlerAdapter
 * @author fade
 * */
public class AnnotationHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }

}
