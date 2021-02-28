package org.fade.pattern.bp.template;

/**
 * 模板模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        SoyMilk pureSoyMilk = new PureSoyMilk();
        System.out.println("--------------制作加了黑豆的豆浆--------------");
        blackBeanSoyMilk.make();
        System.out.println("--------------制作加了花生的豆浆--------------");
        peanutSoyMilk.make();
        System.out.println("--------------制作加了纯豆浆--------------");
        pureSoyMilk.make();
    }

}
