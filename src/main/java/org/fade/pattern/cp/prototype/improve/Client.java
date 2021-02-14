package org.fade.pattern.cp.prototype.improve;

/**
 * 原型模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom",1,"white");
        System.out.println(prototype.toString());
        for (int i = 0;i<10;i++){
            try {
                System.out.println("克隆羊"+(i+1)+"："+prototype.clone().toString());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }

}
