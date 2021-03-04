package org.fade.pattern.bp.observer.improve;

/**
 * 观察者模式
 * 改进
 * Subject接口
 * @author fade
 * */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
