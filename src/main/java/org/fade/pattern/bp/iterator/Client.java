package org.fade.pattern.bp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        List<College<Department>> list = new ArrayList<>();
        College<Department> info = new InfoCollege<>();
        info.addDepartment("电子系","");
        info.addDepartment("自动化系","");
        College<Department> computer = new ComputerCollege<>();
        computer.addDepartment("人工智能系","");
        computer.addDepartment("信息安全系","");
        list.add(info);
        list.add(computer);
        printCollege(list);
    }

    /**
     * 输出学院
     * */
    public static void printCollege(List<College<Department>> list){
        for (College<Department> college : list) {
            System.out.println("============" + college.getName() + "============");
            printDepartment(college.iterator());
        }
    }

    /**
     * 输出系
     * */
    public static void printDepartment(Iterator<Department> iterator){
        while (iterator.hasNext()){
            Department department = iterator.next();
            System.out.println(department.getName());
        }
    }

}
