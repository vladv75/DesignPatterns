package CommandPattern;

/**
 * GarageDoorOnCommand.java  v.1.0  07.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class GarageDoorOnCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.on();
    }
}
