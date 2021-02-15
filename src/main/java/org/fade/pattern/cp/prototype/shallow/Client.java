package org.fade.pattern.cp.prototype.shallow;

/**
 * 原型模式
 * 浅拷贝
 * 羊
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom",1,"white");
        prototype.setFriend(new Sheep("Kobe",2,"black"));
        try {
            Sheep clone = (Sheep) prototype.clone();
            System.out.println(prototype.toString());
            System.out.println(clone.toString());
            System.out.println(prototype==clone);
            System.out.println(prototype.getFriend()==clone.getFriend());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
