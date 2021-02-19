package org.fade.pattern.sp.adapter.mvc.servlet;

import org.fade.pattern.sp.adapter.mvc.adapter.AnnotationHandlerAdapter;
import org.fade.pattern.sp.adapter.mvc.adapter.HandlerAdapter;
import org.fade.pattern.sp.adapter.mvc.adapter.HttpHandlerAdapter;
import org.fade.pattern.sp.adapter.mvc.adapter.SimpleHandlerAdapter;
import org.fade.pattern.sp.adapter.mvc.controller.Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 适配器模式
 * 模拟SpringMVC处理流程中适配器适配过程
 * DispatcherServlet分发器
 * @author fade
 * */
public class DispatcherServlet {

    private List<HandlerAdapter> handlerAdapters;

    public DispatcherServlet(){
        handlerAdapters = new ArrayList<>();
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch(Controller controller){
        try {
            //获取HandlerAdapter
            HandlerAdapter adapter = this.getHandlerAdapter(controller);
            //调用Controller对应方法
            adapter.handle(controller);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private HandlerAdapter getHandlerAdapter(Controller controller) throws Exception {
        if (this.handlerAdapters!=null){
            Iterator<HandlerAdapter> iterator = this.handlerAdapters.iterator();
            while(iterator.hasNext()){
                HandlerAdapter adapter = iterator.next();
                if (adapter.supports(controller)){
                    return adapter;
                }
            }
        }
        throw new Exception("No adapter for handler [" + controller + "]: The DispatcherServlet configuration needs to include a HandlerAdapter that supports this handler");
    }

}
