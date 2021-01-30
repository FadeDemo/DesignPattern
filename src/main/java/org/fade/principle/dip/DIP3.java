package org.fade.principle.dip;

/**
 * 依赖倒转原则（遵循）
 * 通过setter方法传递
 * @author fade
 * */
public class DIP3 {

    public static void main(String[] args){
        OpenAndClose1 object = new OpenAndClose1();
        object.setTV(new ChangHong());
        object.open();
        object.setTV(new Sony());
        object.open();
    }

}

interface IOpenAndClose1{

    void open();

    void setTV(ITV tv);

}

//下列代码已在DIP2.java存在
//interface ITV{
//
//    void play();
//
//}

class OpenAndClose1 implements IOpenAndClose1{

    private ITV tv;

    @Override
    public void open() {
        this.tv.play();
    }

    @Override
    public void setTV(ITV tv) {
        this.tv = tv;
    }

}

//下列代码已在DIP2.java存在
//class ChangHong implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("打开了长虹电视机");
//    }
//
//}
//
//class Sony implements ITV{
//
//    @Override
//    public void play() {
//        System.out.println("打开了索尼电视机");
//    }
//
//}
