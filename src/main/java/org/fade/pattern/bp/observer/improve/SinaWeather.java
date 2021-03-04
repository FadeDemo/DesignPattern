package org.fade.pattern.bp.observer.improve;

/**
 * 观察者模式
 * 改进
 * 具体的Observer
 * @author fade
 * */
public class SinaWeather implements Observer {

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
        System.out.println("******Today, the temperature on the Sina Website is "+this.temperature+"******");
        System.out.println("******Today, the pressure on the Sina Website is "+this.pressure+"******");
        System.out.println("******Today, the humidity on the Sina Website is "+this.humidity+"******");
    }

}
