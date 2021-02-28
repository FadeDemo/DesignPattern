package org.fade.pattern.bp.template;

/**
 * 模板模式
 * 豆浆抽象类
 * @author fade
 * */
public abstract class SoyMilk {

    public void select(){
        System.out.println("挑选材料......");
    }

    public abstract void add();

    public void soak(){
        System.out.println("浸泡材料......");
    }

    public void smash(){
        System.out.println("搅碎材料......");
    }

    /**
     * 是否添加材料
     * 钩子方法
     * */
    public boolean isAdd(){
        return true;
    }

    /**
     * 制作豆浆
     * 模板方法
     * */
    public void make(){
        this.select();
        if (this.isAdd()){
            this.add();
        }
        this.soak();
        this.smash();
    }

}
