package be.ucll.command_lamp.invoker;

import be.ucll.command_lamp.commands.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
