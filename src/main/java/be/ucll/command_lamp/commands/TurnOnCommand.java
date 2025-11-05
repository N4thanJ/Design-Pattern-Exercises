package be.ucll.command_lamp.commands;

import be.ucll.command_lamp.devices.Lamp;

public class TurnOnCommand implements Command {
    private Lamp lamp;

    public TurnOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void execute() {
        lamp.turnOn();
    }

}
