package org.fade.pattern.sp.bridge.improve.style;

import org.fade.pattern.sp.bridge.improve.prototype.Phone;

/**
 * 桥接模式
 * 改进
 * 折叠式手机
 * @author fade
 * */
public class FoldablePhone extends Phone {

    /**
     * 开机
     *
     * @throws NullPointerException
     */
    @Override
    public void open() {
        System.out.print("折叠式");
        super.open();
    }

    /**
     * 关机
     *
     * @throws NullPointerException
     */
    @Override
    public void close() {
        System.out.print("折叠式");
        super.close();
    }

    /**
     * 打电话
     *
     * @throws NullPointerException
     */
    @Override
    public void call() {
        System.out.print("折叠式");
        super.call();
    }

}
