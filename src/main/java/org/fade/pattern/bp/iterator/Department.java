package org.fade.pattern.bp.iterator;

/**
 * 迭代器模式
 * 系
 * @author fade
 * */
public class Department {

    private String name;

    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Department(String name, String description) {
        this.name = name;
        this.description = description;
    }

}
