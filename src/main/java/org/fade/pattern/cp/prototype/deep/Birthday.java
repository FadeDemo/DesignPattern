package org.fade.pattern.cp.prototype.deep;

import java.io.Serializable;

/**
 * 原型模式
 * 深拷贝
 * 出生日期
 * @author fade
 * */
public class Birthday implements Cloneable, Serializable {

    private int year;

    private int month;

    private int day;

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
