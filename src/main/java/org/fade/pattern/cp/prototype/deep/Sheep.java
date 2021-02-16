package org.fade.pattern.cp.prototype.deep;

import java.io.*;

/**
 * 原型模式
 * 深拷贝
 * 羊
 * @author fade
 * */
public class Sheep implements Cloneable, Serializable {

    private String name;

    private int age;

    private String color;

    private Birthday birthday;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Birthday getBirthday() {
        return birthday;
    }

    public void setBirthday(Birthday birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * 重写clone()方法
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object = super.clone();
        Sheep sheep = (Sheep)object;
        Birthday birthday = sheep.getBirthday();
        sheep.setBirthday((Birthday) birthday.clone());
        return sheep;
    }

    /**
     * 对象序列化与反序列化方法
     * */
    public Object deepClone(){
        Object object;
        ObjectOutputStream out = null;
        ObjectInputStream in = null;
        try {
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            out = new ObjectOutputStream(bao);
            out.writeObject(this);
            in = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
            object = in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            object = null;
        }finally {
            if (out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return object;
    }

}
