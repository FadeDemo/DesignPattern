package org.fade.pattern.bp.visitor;

/**
 * 访问者模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Audience audience = new Audience();
        Person jack = new Man();
        Person rose = new Woman();
        audience.attach(jack);
        audience.attach(rose);
        Good good = new Good();
        audience.display(good);
        System.out.println("======================");
        Bad bad = new Bad();
        audience.display(bad);
    }

}
