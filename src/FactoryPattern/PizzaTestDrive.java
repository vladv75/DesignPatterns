package FactoryPattern;

/**
 * PizzaTestDrive.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore ruStore = new RUPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("...ordered a " + pizza.getName() + "\n");

        pizza = ruStore.orderPizza("cheese");
        System.out.println("...ordered a " + pizza.getName() + "\n");

        pizza = ruStore.orderPizza("bigcheese");
        System.out.println("...ordered a " + pizza.getName() + "\n");
    }
}
