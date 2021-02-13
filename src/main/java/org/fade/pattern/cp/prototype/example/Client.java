package org.fade.pattern.cp.prototype.example;

/**
 * 原型模式
 * 例子
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Sheep prototype = new Sheep("Tom",1,"white");
        System.out.println(prototype.toString());
        for (int i = 0;i<10;i++){
            System.out.println("克隆羊"+(i+1)+"："+
                    new Sheep(prototype.getName(),prototype.getAge(),prototype.getColor()).toString());
        }
    }

}
