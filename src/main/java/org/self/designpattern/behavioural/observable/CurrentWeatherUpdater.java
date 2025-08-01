package org.self.designpattern.behavioural.observable;

public class CurrentWeatherUpdater implements WeatherUpdate {

    @Override
    public void updateWeather(int temperature, Float humidity, String weatherCondition) {
        System.out.println("Current weather updated: " + weatherCondition +
                           " with temperature: " + temperature +
                           " and humidity: " + humidity);
    }
}
