package org.fade.pattern.bp.visitor;

/**
 * 访问者模式
 * 具体行动类
 * 具体访问者
 * @author fade
 * */
public class Bad extends Action{

    /**
     * 获得男性评测
     *
     * @param man 男性对象
     */
    @Override
    public void getManResult(Man man) {
        System.out.println("男人的评价是差评......");
    }

    /**
     * 获得女性评测
     *
     * @param woman 女性对象
     */
    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人的评价是差评......");
    }

}
