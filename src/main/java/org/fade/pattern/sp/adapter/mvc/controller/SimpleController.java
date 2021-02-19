package org.fade.pattern.sp.adapter.mvc.controller;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * SimpleController
 * @author fade
 * */
public class SimpleController implements Controller {

    public void doSimpleHandler(){
        System.out.println("simple...");
    }

}
