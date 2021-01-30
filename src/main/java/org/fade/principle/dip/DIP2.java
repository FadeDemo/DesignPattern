package org.fade.principle.dip;

/**
 * 依赖倒转原则（遵循）
 * 通过构造方法传递依赖
 * @author fade
 * */
public class DIP2 {

    public static void main(String[] args){
        OpenAndClose object = new OpenAndClose(new ChangHong());
        object.open();
        object = new OpenAndClose(new Sony());
        object.open();
    }

}

interface IOpenAndClose{

    void open();

}

interface ITV{

    void play();

}

class OpenAndClose implements IOpenAndClose{

    public ITV tv;

    public OpenAndClose(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }

}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("打开了长虹电视机");
    }

}

class Sony implements ITV{

    @Override
    public void play() {
        System.out.println("打开了索尼电视机");
    }

}
