package org.fade.pattern.cp.prototype.deep;

/**
 * 原型模式
 * 深拷贝
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom",1,"white");
        prototype.setBirthday(new Birthday(1949,10,1));
        System.out.println("prototype:"+prototype.toString());
        try {
            Sheep clone1 = (Sheep) prototype.clone();
            System.out.println("重写clone()："+clone1.toString());
            System.out.println(prototype==clone1);
            System.out.println(prototype.getBirthday()==clone1.getBirthday());
            Sheep clone2 = (Sheep) prototype.deepClone();
            System.out.println("对象序列化与反序列化："+clone2.toString());
            System.out.println(prototype==clone2);
            System.out.println(prototype.getBirthday()==clone2.getBirthday());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
