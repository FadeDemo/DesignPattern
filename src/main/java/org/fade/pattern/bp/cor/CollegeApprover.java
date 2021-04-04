package org.fade.pattern.bp.cor;

/**
 * 职责链模式
 * 院审批人
 * @author fade
 * */
public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getPrice()>5000&&request.getPrice()<=10000){
            System.out.println("请求编号id="+request.getId()+"被"+this.getName()+"处理了......");
        }
        else{
            this.getApprover().processRequest(request);
        }
    }

}
