package SingletonPattern;

/**
 * Singleton_v3  v.1.0  05.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Singleton_v3 {
    private volatile static Singleton_v3 uniqueInstance;

    private Singleton_v3() {}

    public static synchronized Singleton_v3 getInstance() {
        if (uniqueInstance == null) { //синхронизация выполняется только при первом вызове
            synchronized (Singleton_v3.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton_v3();
                }
            }
        }
        return uniqueInstance;
    }
}
