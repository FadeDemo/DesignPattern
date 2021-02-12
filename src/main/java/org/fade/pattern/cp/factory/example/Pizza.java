package org.fade.pattern.cp.factory.example;

/**
 * 工厂模式
 * 例子
 * @author fade
 * */
public abstract class Pizza {

    protected String name;

    /**
     * 披萨不同原材料也就不同
     * */
    public abstract void prepare();

    public void bake(){
        System.out.println(this.name+" is baking");
    }

    public void cut(){
        System.out.println(this.name+" is cutting");
    }

    public void box(){
        System.out.println(this.name+" is boxing");
    }

    public void setName(String name) {
        this.name = name;
    }

}
