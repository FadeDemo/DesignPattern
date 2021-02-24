package org.fade.pattern.sp.composite;

/**
 * 组合模式
 * Organization抽象类
 * @author fade
 * */
public abstract class Organization {

    /**
     * 组织名
     * */
    private String name;

    /**
     * 添加组织
     * @param organization 组织
     * */
    public void add(Organization organization){
        //默认实现
        throw new UnsupportedOperationException();
    }

    /**
     * 移除组织
     * @param organization 组织
     * */
    public void remove(Organization organization){
        //默认实现
        throw new UnsupportedOperationException();
    }

    /**
     * Constructor of Organization
     * @param name 组织名
     * */
    public Organization(String name) {
        this.name = name;
    }

    /**
     * 获得组织名
     * @return 组织名
     * */
    public String getName() {
        return name;
    }

    /**
     * 设置组织名
     * @param name 组织名
     * */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 打印组织信息
     * */
    public abstract void print();

}
