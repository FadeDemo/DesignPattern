package org.fade.pattern.bp.observer.improve;

/**
 * 观察者模式
 * 改进
 * 具体的Observer
 * @author fade
 * */
public class BaiduWeather implements Observer {

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
        System.out.println("******Today, the temperature on the Baidu Website is "+this.temperature+"******");
        System.out.println("******Today, the pressure on the Baidu Website is "+this.pressure+"******");
        System.out.println("******Today, the humidity on the Baidu Website is "+this.humidity+"******");
    }

}
