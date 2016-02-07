package CommandPattern.PultExample;

/**
 * GarageDoorOffCommand.java  v.1.0  07.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class GarageDoorOffCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOffCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.off();
    }

    public void undo() {
        garageDoor.on();
    }
}
