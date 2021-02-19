package org.fade.pattern.sp.adapter.mvc.controller;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * AnnotationController
 * @author fade
 * */
public class AnnotationController implements Controller {

    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }

}
