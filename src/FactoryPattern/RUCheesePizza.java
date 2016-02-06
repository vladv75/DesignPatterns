package FactoryPattern;

/**
 * RUCheesePizza  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class RUCheesePizza extends Pizza {
    public RUCheesePizza() {
        name = "RU Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Apple Cheese");
        toppings.add("Tomato Souse");
    }
}
