package org.fade.pattern.bp.observer.example;

/**
 * 观察者模式
 * 例子
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(new CurrentWeatherCondition());
        weatherData.setData(25f,1020.3f,0.85f);
    }

}
