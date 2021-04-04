package org.fade.pattern.bp.cor;

/**
 * 职责链模式
 * 校审批人(副校级别)
 * @author fade
 * */
public class ViceSchoolMasterApprover extends Approver {

    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getPrice()>10000&&request.getPrice()<=30000){
            System.out.println("请求编号id="+request.getId()+"被"+this.getName()+"处理了......");
        }
        else {
            this.getApprover().processRequest(request);
        }
    }

}
