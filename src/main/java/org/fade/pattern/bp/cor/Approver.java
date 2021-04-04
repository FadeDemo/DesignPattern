package org.fade.pattern.bp.cor;

/**
 * 责任链模式
 * 抽象审批人
 * @author fade
 * */
public abstract class Approver {

    private Approver approver;

    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setApprover(Approver approver) {
        this.approver = approver;
    }

    public String getName() {
        return name;
    }

    public Approver getApprover() {
        return approver;
    }

    public abstract void processRequest(PurchaseRequest request);

}
