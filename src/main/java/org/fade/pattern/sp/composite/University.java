package org.fade.pattern.sp.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 组合模式
 * 大学
 * @author fade
 * */
public class University extends Organization {

    /**
     * 大学里的下属组织
     * */
    List<Organization> university;

    /**
     * Constructor of University
     * @param name 大学名
     * */
    public University(String name){
        super(name);
        this.university = new LinkedList<>();
    }

    /**
     * 添加下属组织
     * @param organization 下属组织
     * */
    @Override
    public void add(Organization organization) {
        this.university.add(organization);
    }

    /**
     * 移除下属组织
     * @param organization 下属组织
     * */
    @Override
    public void remove(Organization organization) {
        this.university.remove(organization);
    }

    /**
     * 打印组织信息
     */
    @Override
    public void print() {
        System.out.println("--------------------"+super.getName()+"--------------------");
        for (Organization organization:university
             ) {
            organization.print();
        }
    }

}
