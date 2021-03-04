package org.fade.pattern.bp.observer.example;

/**
 * 观察者模式
 * 例子
 * 天气当前状况
 * @author fade
 * */
public class CurrentWeatherCondition {

    private float temperature;

    private float pressure;

    private float humidity;

    public void update(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.display();
    }

    public void display(){
        System.out.println("******Today, the temperature is "+this.temperature+"******");
        System.out.println("******Today, the pressure is "+this.pressure+"******");
        System.out.println("******Today, the humidity is "+this.humidity+"******");
    }

}
