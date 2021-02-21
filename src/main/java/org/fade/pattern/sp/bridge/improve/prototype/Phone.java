package org.fade.pattern.sp.bridge.improve.prototype;

import org.fade.pattern.sp.bridge.improve.brand.Brand;

/**
 * 桥接模式
 * 改进
 * 抽象类Phone
 * @author fade
 * */
public abstract class Phone {

    /**
     * 品牌
     * */
    private Brand brand;

    /**
     * 设置品牌
     * */
    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    /**
     * 开机
     * @throws NullPointerException
     * */
    public void open(){
        if(this.brand!=null){
            this.brand.open();
        }
        else{
            throw new NullPointerException("未设置brand");
        }
    }

    /**
     * 关机
     * @throws NullPointerException
     * */
    public void close(){
        if(this.brand!=null){
            this.brand.close();
        }
        else{
            throw new NullPointerException("未设置brand");
        }
    }

    /**
     * 打电话
     * @throws NullPointerException
     * */
    public void call(){
        if(this.brand!=null){
            this.brand.call();
        }
        else{
            throw new NullPointerException("未设置brand");
        }
    }

}
