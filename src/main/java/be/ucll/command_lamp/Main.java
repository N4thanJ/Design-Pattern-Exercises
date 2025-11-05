package be.ucll.command_lamp;

import be.ucll.command_lamp.commands.Command;
import be.ucll.command_lamp.commands.TurnOffCommand;
import be.ucll.command_lamp.commands.TurnOnCommand;
import be.ucll.command_lamp.devices.Lamp;
import be.ucll.command_lamp.invoker.RemoteControl;

public class Main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Command turnOn = new TurnOnCommand(lamp);
        Command turnOff = new TurnOffCommand(lamp);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();
    }

}
