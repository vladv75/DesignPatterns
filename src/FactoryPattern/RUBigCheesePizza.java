package FactoryPattern;

/**
 * RUBigCheesePizza.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class RUBigCheesePizza extends Pizza {
    public RUBigCheesePizza() {
        name = "RU Big Cheese Pizza";
        dough = "Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Grated Cheese");
        toppings.add("Milk Souse");
    }
}
