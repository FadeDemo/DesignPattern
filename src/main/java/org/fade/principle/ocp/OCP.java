package org.fade.principle.ocp;

/**
 * 开闭原则（违背）
 * @author fade
 * */
public class OCP {

    public static void main(String[] args){
        GraphicEditor editor = new GraphicEditor();
        editor.drawShape(new Rectangle());
        editor.drawShape(new Circle());
//        editor.drawShape(new Triangle());
    }

}

/**
 * 使用方
 * */
class GraphicEditor{

    /**
     * 根据Shape的type值绘制不同的图形
     * */
    public void drawShape(Shape shape){
        if(shape.type==1){
            drawRectangle(shape);
        }
        else if(shape.type==2){
            drawCircle(shape);
        }
        else{
            //修改部分
//            drawTriangle(shape);
        }
    }

    public void drawRectangle(Shape shape){
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape shape){
        System.out.println("绘制圆形");
    }

    //对使用方的修改开放了，违背了开闭原则
//    public void drawTriangle(Shape shape){
//        System.out.println("绘制三角形");
//    }

}

/**
 * 提供方
 * */
class Shape{

    int type;

}

class Rectangle extends Shape{

    Rectangle(){
        super.type = 1;
    }

}

class Circle extends Shape{

    Circle(){
        super.type = 2;
    }

}

//新增三角形

//class Triangle extends Shape{
//
//    Triangle(){
//        super.type = 3;
//    }
//
//}
