package SingletonPattern;

/**
 * Singleton_v4  v.1.0  05.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Singleton_v4 {
    // Private constructor prevents instantiation from other classes
    private Singleton_v4() {}

    /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance()
     * or the first access to SingletonHolder.INSTANCE, not before.
     * http://programador.ru/singleton/
     */
    private static class SingletonHolder {
        private static final Singleton_v4 INSTANCE = new Singleton_v4();
    }

    public static Singleton_v4 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
