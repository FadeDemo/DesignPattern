package org.fade.pattern.sp.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 组合模式
 * 学院
 * @author fade
 * */
public class College extends Organization{

    /**
     * 学院里的下属组织
     * */
    List<Organization> college;

    /**
     * Constructor of College
     * @param name 学院名
     * */
    public College(String name){
        super(name);
        this.college = new LinkedList<>();
    }

    /**
     * 添加下属组织
     * @param organization 下属组织
     * */
    @Override
    public void add(Organization organization) {
        this.college.add(organization);
    }

    /**
     * 移除下属组织
     * @param organization 下属组织
     * */
    @Override
    public void remove(Organization organization) {
        this.college.remove(organization);
    }

    /**
     * 打印组织信息
     */
    @Override
    public void print() {
        System.out.println("--------------------"+super.getName()+"--------------------");
        for (Organization organization:college
        ) {
            organization.print();
        }
    }

}
