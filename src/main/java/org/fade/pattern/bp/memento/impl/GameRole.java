package org.fade.pattern.bp.memento.impl;

/**
 * 备忘录模式
 * 原理
 * 游戏角色(原发器)
 * @author fade
 * */
public class GameRole {

    private int vit;

    private int def;

    public GameRole(int vit, int def) {
        this.vit = vit;
        this.def = def;
    }

    public GameRole() {
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

    public Memento saveState(){
        return new Memento(this.vit,this.def);
    }

    public void recoverState(Memento memento){
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    @Override
    public String toString() {
        return "GameRole{" +
                "vit=" + vit +
                ", def=" + def +
                '}';
    }

    public void displayState(){
        System.out.println(this.toString());
    }

}
