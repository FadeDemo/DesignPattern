package org.fade.pattern.bp.observer.example;

/**
 * 观察者模式
 * 例子
 * 天气数据
 * @author fade
 * */
public class WeatherData {

    private float temperature;

    private float pressure;

    private float humidity;

    private CurrentWeatherCondition currentWeatherCondition;

    public WeatherData(CurrentWeatherCondition currentWeatherCondition){
        this.currentWeatherCondition = currentWeatherCondition;
    }

    public void dataChange(){
        this.currentWeatherCondition.update(this.temperature,this.pressure,this.humidity);
    }

    public void setData(float temperature,float pressure,float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.dataChange();
    }

}
