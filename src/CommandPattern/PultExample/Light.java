package CommandPattern.PultExample;

/**
 * Light.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Light {
    String nameObject;

    public Light(String nameObject) {
        this.nameObject = nameObject;
    }

    public void on() {
        System.out.println(nameObject + " Light On");
    }

    public void off() {
        System.out.println(nameObject + " Light Off");
    }
}
