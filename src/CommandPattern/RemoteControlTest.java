package CommandPattern;

/**
 * RemoteLoader.java  v.1.0  06.02.16
 * Copyright (c) 2016 Vladislav Laptev,
 * All rights reserved. Used by permission,
 * e-mail: vlad@allfound.ru
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        //включаем свет
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        //открываем дверь в гараже
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garageDoor);
        remoteControl.setCommand(garageDoorOnCommand);
        remoteControl.buttonWasPressed();
    }
}
