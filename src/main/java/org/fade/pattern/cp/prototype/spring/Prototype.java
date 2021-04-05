package org.fade.pattern.cp.prototype.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 原型模式
 * 在spring框架中的源码分析
 * @author fade
 * */
public class Prototype {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(System.getProperty("user.dir")
                +"/src/main/java/org/fade/pattern/cp/prototype/spring/ApplicationContext.xml");
        Object bean1 = applicationContext.getBean("id01");
        System.out.println("bean1:"+bean1);
        Object bean2 = applicationContext.getBean("id01");
        System.out.println("bean2:"+bean2);
        System.out.println(bean1==bean2);
    }

}
