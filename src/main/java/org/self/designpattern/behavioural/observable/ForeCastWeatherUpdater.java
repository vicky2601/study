package org.self.designpattern.behavioural.observable;

public class ForeCastWeatherUpdater implements WeatherUpdate {

    @Override
    public void updateWeather(int temperature, Float humidity, String weatherCondition) {
        System.out.println("Forecast weather updated: " + weatherCondition +
                           " with temperature: " + temperature +
                           " and humidity: " + humidity);
    }
}
