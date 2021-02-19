package org.fade.pattern.sp.adapter.mvc.adapter;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * HandlerAdapter接口
 * @author fade
 * */
public interface HandlerAdapter {

    boolean supports(Object handler);

    void handle(Object handler);

}
