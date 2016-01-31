package StrategyPattern;

/**
 * Quack.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission
 * e-mail: vlad@allfound.ru
 */
public class Quack implements IQuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
