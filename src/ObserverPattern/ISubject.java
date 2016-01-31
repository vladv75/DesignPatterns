package ObserverPattern;

/**
 * ISubject.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObserver();
}
