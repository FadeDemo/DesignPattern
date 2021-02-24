package org.fade.pattern.sp.composite;

/**
 * 组合模式
 * 系
 * @author fade
 * */
public class Department extends Organization {

    /**
     * Constructor of Department
     * @param name 系名
     * */
    public Department(String name){
        super(name);
    }

    /**
     * 打印组织信息
     */
    @Override
    public void print() {
        System.out.println(super.getName());
    }

}
