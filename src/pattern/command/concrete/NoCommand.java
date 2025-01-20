package pattern.command.concrete;

import pattern.command.Command;

public class NoCommand implements Command {

  @Override
  public void execute() {
    System.out.println("No command");
  }

  @Override
  public void undo() {

  }
}
