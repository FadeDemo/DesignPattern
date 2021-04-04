package org.fade.pattern.bp.cor;

/**
 * 责任链模式
 * 系审批人
 * @author fade
 * */
public class DepartmentApprover extends Approver{

    public DepartmentApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()<=5000){
            System.out.println("请求编号id="+request.getId()+"被"+this.getName()+"处理了......");
        }
        else {
            this.getApprover().processRequest(request);
        }
    }

}
