package org.fade.pattern.sp.bridge.improve;

import org.fade.pattern.sp.bridge.improve.brand.HUAWEI;
import org.fade.pattern.sp.bridge.improve.style.FoldablePhone;

/**
 * 桥接模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        FoldablePhone foldablePhone = new FoldablePhone();
        foldablePhone.setBrand(new HUAWEI());
        foldablePhone.open();
        foldablePhone.call();
        foldablePhone.close();
    }

}
