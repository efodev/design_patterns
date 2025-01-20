package pattern.command.controller;

import pattern.command.Command;
import pattern.command.concrete.NoCommand;

public class RemoteControl {
  Command[] onCommands; // holds all on commands
  Command[] offCommands; // holds all off commands
  Command undoCommand;

  /**
   * Instantiate the remote control and populates the command
   */
  public RemoteControl() {
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++) {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    this.undoCommand = noCommand;
  }

  public void setCommands(int slot, Command onCommand, Command offCommand) {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot) {
    onCommands[slot].execute();
    this.undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot) {
    offCommands[slot].execute();
    this.undoCommand = offCommands[slot];
  }
  @Override
  public String toString() {
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("\n------ Remote Control ------\n");
    for (int i = 0; i < onCommands.length; i++) {
      stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
      + "    " + offCommands[i].getClass().getName() + "\n");
    }
    return stringBuffer.toString();
  }
public void undoButtonWasPushed() {
    undoCommand.undo();
}
}
