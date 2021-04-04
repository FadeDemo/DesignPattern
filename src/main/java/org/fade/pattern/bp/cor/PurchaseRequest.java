package org.fade.pattern.bp.cor;

/**
 * 职责链模式
 * 购买请求
 * @author fade
 * */
public class PurchaseRequest {

    private float price;

    private int id;

    public PurchaseRequest(float price,int id){
        this.price = price;
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

}
