package org.fade.pattern.bp.memento.impl;

/**
 * 备忘录模式
 * 实现
 * 备忘录
 * @author fade
 * */
public class Memento {

    /**
     * 体力
     * */
    private int vit;

    /**
     * 防御力
     * */
    private int def;

    public Memento(int vit,int def){
        this.vit = vit;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

}
