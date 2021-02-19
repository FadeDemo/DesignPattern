package org.fade.pattern.sp.adapter.mvc.controller;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * HttpController
 * @author fade
 * */
public class HttpController implements Controller {

    public void doHttpHandler(){
        System.out.println("http...");
    }

}
