package org.fade.principle.ocp;

/**
 * 开闭原则（遵循）
 * @author fade
 * */
public class OCP1 {

    public static void main(String[] args){
        GraphicEditor1 editor = new GraphicEditor1();
        editor.drawShape(new Rectangle1());
        editor.drawShape(new Circle1());
        //新增三角形
        editor.drawShape(new Triangle1());
    }

}

/**
 * 使用方
 * */
class GraphicEditor1{

    public void drawShape(Shape1 shape){
        shape.draw();
    }

}

/**
 * 提供方
 * */
abstract class Shape1{

    int type;

    public abstract void draw();

}

class Rectangle1 extends Shape1{

    Rectangle1(){
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }

}

class Circle1 extends Shape1{

    Circle1(){
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }

}

//新增三角形

class Triangle1 extends Shape1{

    Triangle1(){
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }

}
