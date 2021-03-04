package org.fade.pattern.bp.observer.improve;

/**
 * 观察者模式
 * 改进
 * 客户端
 * @author fade
 * */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer baidu = new BaiduWeather();
        Observer sina = new SinaWeather();
        weatherData.registerObserver(baidu);
        weatherData.registerObserver(sina);
        weatherData.setData(25f,1020.3f,0.85f);
    }

}
