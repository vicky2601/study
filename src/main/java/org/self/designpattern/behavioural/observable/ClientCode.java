package org.self.designpattern.behavioural.observable;

public class ClientCode {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherUpdate foreCastWeatherUpdater = new ForeCastWeatherUpdater();
        WeatherUpdate currentWeatherUpdater = new CurrentWeatherUpdater();

        // Registering weather
        weatherStation.registerWeatherUpdate(foreCastWeatherUpdater);
        weatherStation.registerWeatherUpdate(currentWeatherUpdater);

        // Simulating weather updates
        weatherStation.setWeather(30, 65.0f, "Sunny");
        weatherStation.setWeather(25, 70.0f, "Cloudy");
        weatherStation.setWeather(20, 80.0f, "Rainy");

    }
}
