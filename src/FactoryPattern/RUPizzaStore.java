package FactoryPattern;

/**
 * RUPizzaStore.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class RUPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new RUCheesePizza();
            case "bigcheese":
                return new RUBigCheesePizza();
            default:
                return null;
        }
    }
}
