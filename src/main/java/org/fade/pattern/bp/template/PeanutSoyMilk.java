package org.fade.pattern.bp.template;

/**
 * 模板模式
 * 加入了花生的豆浆
 * @author fade
 * */
public class PeanutSoyMilk extends SoyMilk {

    @Override
    public void add() {
        System.out.println("加入了花生......");
    }

}
