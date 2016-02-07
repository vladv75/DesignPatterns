package CommandPattern.PultExample;

/**
 * Stereo.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class Stereo {
    String nameObject;

    public Stereo(String nameObject) {
        this.nameObject = nameObject;
    }

    public void on() {
        System.out.println(nameObject + " Stereo On");
    }

    public void off() {
        System.out.println(nameObject + " Stereo Off");
    }

    public void setCD() {
        System.out.println("CD sets");
    }

    public void setDVD() {
        System.out.println("DVD sets");
    }

    public void setRadio() {
        System.out.println("Radio sets");
    }

    public void setVolume(int volume) {
        System.out.println("Volume sets: " + volume);
    }
}
