package org.fade.principle.lkp;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则(违背)
 * @author fade
 * */
public class LKP {

    public static void main(String[] args){
        SchoolManger manger = new SchoolManger();
        manger.printAllEmployee(new CollegeManger());
    }

}

/**
 * 学校总部员工
 * */
class Employee{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

/**
 * 学院员工
 * */
class CollegeEmployee{

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}

/**
 * 管理学院员工的管理类
 * */
class CollegeManger{

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

}

/**
 * 学校总部的管理类
 * 直接朋友：Employee,CollegeManger
 * 非直接朋友：CollegeEmployee
 * */
class SchoolManger{

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
    public void printAllEmployee(CollegeManger manger){
        List<CollegeEmployee> list1 = manger.getAllEmployee();
        System.out.println("-------------学院员工-------------");
        for (CollegeEmployee employee:list1
             ) {
            System.out.println(employee.getId());
        }
        List<Employee> list2 = this.getAllEmployee();
        System.out.println("-------------学校总部员工-------------");
        for (Employee employee:list2
             ) {
            System.out.println(employee.getId());
        }
    }

}
