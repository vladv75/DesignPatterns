package ObserverPattern;

/**
 * FullConditionsDisplay.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class FullConditionsDisplay implements IObserver, IDisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private ISubject weatherData;

    public FullConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity, "
                + "Pressuer = " + pressure);
    }
}
