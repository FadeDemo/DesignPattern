package org.fade.pattern.bp.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 迭代器模式
 * 信息工程学院的迭代器
 * @author fade
 * */
public class InfoCollegeIterator<E> implements Iterator<E> {

    /**
     * 系以集合的形式存放
     * */
    private List<E> departments;

    /**
     * 遍历的位置(索引)
     * */
    private int index;

    public InfoCollegeIterator(List<E> departments) {
        this.index = -1;
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
        if (this.index>=this.departments.size()-1){
            return false;
        }
        else{
            this.index++;
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
        return this.departments.get(index);
    }

}
