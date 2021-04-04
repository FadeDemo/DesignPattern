package org.fade.pattern.bp.cor;

/**
 * 职责链模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("王副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("钱校长");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(departmentApprover);
        PurchaseRequest request = new PurchaseRequest(15000, 1);
        departmentApprover.processRequest(request);
    }

}
