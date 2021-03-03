package org.fade.pattern.bp.iterator;

/**
 * 迭代器模式
 * 学院接口
 * @author fade
 * */
public interface College<T> extends Iterable<T> {

    String getName();

    void addDepartment(String name,String description);

}
