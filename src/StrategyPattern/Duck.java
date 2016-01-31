package StrategyPattern;

/**
 * Duck.java    v.1.0 30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission
 * e-mail: vlad@allfound.ru
 */
public abstract class Duck {

    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        quackBehavior = qb;
    }
}
