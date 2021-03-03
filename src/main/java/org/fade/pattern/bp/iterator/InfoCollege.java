package org.fade.pattern.bp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式
 * 信息工程学院
 * @author fade
 * */
@SuppressWarnings("all")
public class InfoCollege<T> implements College<T>{

    private List<T> departments;

    public InfoCollege() {
        this.departments = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        this.departments.add((T)(new Department(name,description)));
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new InfoCollegeIterator<>(departments);
    }

}
