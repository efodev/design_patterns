package pattern.command.concrete;

import pattern.command.Command;
import pattern.command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
  GarageDoor garageDoor;

  public GarageDoorOpenCommand(GarageDoor garageDoor) {
    this.garageDoor = garageDoor;
  }
  @Override
  public void execute() {
    this.garageDoor.open();
  }

  @Override
  public void undo() {

  }
}
