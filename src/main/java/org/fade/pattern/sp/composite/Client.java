package org.fade.pattern.sp.composite;

/**
 * 组合模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        Organization ncu = new University("ncu");
        Organization information = new College("信息工程学院");
        Organization science = new College("理学院");
        Organization computer = new Department("计算机科学与技术系");
        Organization auto = new Department("自动化系");
        Organization electronics = new Department("电子系");
        Organization physics = new Department("物理系");
        Organization math = new Department("数学系");
        ncu.add(information);
        ncu.add(science);
        information.add(computer);
        information.add(auto);
        information.add(electronics);
        science.add(physics);
        science.add(math);
        ncu.print();
    }

}
