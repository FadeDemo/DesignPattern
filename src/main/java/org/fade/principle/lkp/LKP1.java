package org.fade.principle.lkp;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则(遵循)
 * @author fade
 * */
public class LKP1 {

    public static void main(String[] args){
        SchoolManger1 manger = new SchoolManger1();
        manger.printAllEmployee(new CollegeManger1());
    }

}

/**
 * 管理学院员工的管理类
 * */
class CollegeManger1{

    /**
     * 返回学院所有员工
     * */
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        //增加10个员工
        for (int i = 0;i<10;i++){
            CollegeEmployee employee = new CollegeEmployee();
            employee.setId("学院员工id="+i);
            list.add(employee);
        }
        return list;
    }

    public void printEmployee(){
        List<CollegeEmployee> list = this.getAllEmployee();
        System.out.println("-------------学院员工-------------");
        for (CollegeEmployee employee:list
        ) {
            System.out.println(employee.getId());
        }
    }

}


/**
 * 学校总部的管理类
 * 直接朋友：Employee,CollegeManger1
 * */
class SchoolManger1{

    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<>();
        //增加5个员工
        for (int i = 0;i<5;i++){
            Employee employee = new Employee();
            employee.setId("学校总部员工id="+i);
            list.add(employee);
        }
        return list;
    }

    /**
     * 输出学校所有员工信息
     * */
    public void printAllEmployee(CollegeManger1 manger){
        manger.printEmployee();
        List<Employee> list = this.getAllEmployee();
        System.out.println("-------------学校总部员工-------------");
        for (Employee employee:list
        ) {
            System.out.println(employee.getId());
        }
    }

}
