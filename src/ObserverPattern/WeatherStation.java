package ObserverPattern;

/**
 * WeatherStation.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class WeatherStation {
    public static void main(String[] ars) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        FullConditionsDisplay fullConditionsDisplay = new FullConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 35.5f);
        weatherData.measurementsChanged();

        weatherData.setMeasurements(87, 68, 29.4f);
        weatherData.measurementsChanged();

        weatherData.setMeasurements(75, 79, 31.8f);
        weatherData.measurementsChanged();
    }
}
