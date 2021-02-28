package org.fade.pattern.bp.template;

/**
 * 模板模式
 * 加入黑豆的豆浆
 * @author fade
 * */
public class BlackBeanSoyMilk extends SoyMilk {

    @Override
    public void add() {
        System.out.println("添加了黑豆......");
    }

}
