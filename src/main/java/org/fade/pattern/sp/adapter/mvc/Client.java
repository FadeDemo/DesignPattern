package org.fade.pattern.sp.adapter.mvc;

import org.fade.pattern.sp.adapter.mvc.controller.AnnotationController;
import org.fade.pattern.sp.adapter.mvc.controller.HttpController;
import org.fade.pattern.sp.adapter.mvc.controller.SimpleController;
import org.fade.pattern.sp.adapter.mvc.servlet.DispatcherServlet;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.doDispatch(new HttpController());
        dispatcherServlet.doDispatch(new AnnotationController());
        dispatcherServlet.doDispatch(new SimpleController());
    }

}
