package StrategyPattern;

/**
 * FlyRocketPowered.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class FlyRocketPowered implements IFlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
