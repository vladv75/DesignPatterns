package SingletonPattern;

/**
 * Singleton_v1.java  v.1.0  05.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Singleton_v1 {
    private static Singleton_v1 uniqueInstance;

    private Singleton_v1() {}

    public static synchronized Singleton_v1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton_v1();
        }
        return uniqueInstance;
    }
}
