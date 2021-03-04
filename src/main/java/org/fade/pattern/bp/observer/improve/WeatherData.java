package org.fade.pattern.bp.observer.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式
 * 改进
 * 具体的Subject
 * @author fade
 * */
public class WeatherData implements Subject {

    private float temperature;

    private float pressure;

    private float humidity;

    private List<Observer> observers;

    public WeatherData(){
        this.observers = new ArrayList<>();
    }

    public void dataChange(){
        this.notifyObserver();
    }

    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dataChange();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer:this.observers){
            observer.update(this.temperature,this.pressure,this.humidity);
        }
    }

}
