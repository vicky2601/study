package org.self.designpattern.behavioural.observable;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    List<WeatherUpdate> weatherUpdates = new ArrayList<>();
    int temperature;
    Float humidity;
    String weatherCondition;

    public void registerWeatherUpdate(WeatherUpdate weatherUpdate) {
        weatherUpdates.add(weatherUpdate);
    }

    public void unregisterWeatherUpdate(WeatherUpdate weatherUpdate) {
        weatherUpdates.remove(weatherUpdate);
    }

    public void notifyWeatherUpdate() {
        for (WeatherUpdate weatherUpdate : weatherUpdates) {
            weatherUpdate.updateWeather(temperature, humidity, weatherCondition);
        }
    }

    public void setWeather(int temperature, Float humidity, String weatherCondition) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherCondition = weatherCondition;
        notifyWeatherUpdate();
    }
}
