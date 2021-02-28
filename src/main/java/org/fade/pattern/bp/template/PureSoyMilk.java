package org.fade.pattern.bp.template;

/**
 * 模板模式
 * 纯豆浆
 * @author fade
 * */
public class PureSoyMilk extends SoyMilk {

    @Override
    public void add() {
        //空实现
    }

    /**
     * 是否添加材料
     * 钩子方法
     */
    @Override
    public boolean isAdd() {
        return false;
    }

}
