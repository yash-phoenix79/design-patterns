package com.designpatterns.behavioral.command;

public class Client {
    public static void main(String[] args) {
        //Receiver objects
        Light light= new Light();
        Fan fan = new Fan();

        Command lightOn = new LightOnCommand(light);
        Command fanOn = new FanOnCommand(fan);

        RemoteControl remote= new RemoteControl();
        remote.setCommand(lightOn);
        remote.executeButton();
        remote.undoButton();

        remote.setCommand(fanOn);
        remote.executeButton();
        remote.undoButton();

    }
}
