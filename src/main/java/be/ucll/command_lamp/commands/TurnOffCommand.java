package be.ucll.command_lamp.commands;

import be.ucll.command_lamp.devices.Lamp;

public class TurnOffCommand implements Command {
    private Lamp lamp;

    public TurnOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        this.lamp.turnOff();
    }

}