package StrategyPattern;

/**
 * ________  v._._  30.01.16
 * <p/>
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission.
 */
public class FlyWithWings implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!!");
    }
}
