package org.fade.pattern.sp.flyweight;

/**
 * 享元模式
 * 网站具体类
 * @author fade
 * */
public class ConcreteWebsite extends Website {

    private String type;

    public ConcreteWebsite(String type){
        super();
        this.type = type;
    }

    @Override
    public void use(String username) {
        System.out.println("网站的发布类型为："+this.type+"，正在被"+username+"使用着");
    }

}
