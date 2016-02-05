package SingletonPattern;

/**
 * Singleton_v2.java  v.1.0  05.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Singleton_v2 {
    private static Singleton_v2 uniqueInstance = new Singleton_v2();

    private Singleton_v2() {}

    public static Singleton_v2 getInstance() {
        return uniqueInstance;
    }
}
