package ObserverPattern;

/**
 * IObserver.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public interface IObserver {
    public void update(float temp, float humidity, float pressure);
}
