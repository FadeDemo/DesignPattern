package org.fade.pattern.bp.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 迭代器模式
 * 计算机学院的迭代器
 * @author fade
 * */
public class ComputerCollegeIterator<E> implements Iterator<E> {

    /**
     * 系以数组的形式存放
     * */
    private E[] departments;

    /**
     * 遍历的位置
     * */
    private int position;

    public ComputerCollegeIterator(E[] departments) {
        this.departments = departments;
    }

    /**
     * Returns {@code true} if the iteration has more elements.
     * (In other words, returns {@code true} if {@link #next} would
     * return an element rather than throwing an exception.)
     *
     * @return {@code true} if the iteration has more elements
     */
    @Override
    public boolean hasNext() {
        if(this.position>=this.departments.length||this.departments[this.position]==null){
            return false;
        }
        else{
            return true;
        }
    }

    /**
     * Returns the next element in the iteration.
     *
     * @return the next element in the iteration
     * @throws NoSuchElementException if the iteration has no more elements
     */
    @Override
    public E next() {
        return this.departments[this.position++];
    }

}
