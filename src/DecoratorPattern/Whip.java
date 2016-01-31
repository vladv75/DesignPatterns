package DecoratorPattern;

/**
 * Whip.java  v.1.0  30.01.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip (Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .70 + beverage.cost();
    }

}
