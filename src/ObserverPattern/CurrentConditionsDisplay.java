package ObserverPattern;

/**
 * CurrentConditionsDisplay.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class CurrentConditionsDisplay implements IObserver, IDisplayElement {
    private float temperature;
    private float humidity;
    private ISubject weatherData;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
