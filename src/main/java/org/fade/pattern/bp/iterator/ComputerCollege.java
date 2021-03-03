package org.fade.pattern.bp.iterator;

import java.util.Iterator;

/**
 * 迭代器模式
 * 计算机学院
 * @author fade
 * */
@SuppressWarnings("all")
public class ComputerCollege<T> implements College<T> {

    private T[] departments;

    private int num;

    public ComputerCollege() {
        this.departments = (T[])new Object[5];
        this.num = 0;
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String description) {
        this.departments[this.num] = (T) new Department(name,description);
        num++;
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<T> iterator() {
        return new ComputerCollegeIterator<>(departments);
    }

}
