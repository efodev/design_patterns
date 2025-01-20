package pattern.command.concrete;

import pattern.command.Command;
import pattern.command.receiver.Light;

public class LightoffCommand implements Command {
  Light light;

  public LightoffCommand(Light light) {
    this.light = light;
  }
  @Override
  public void execute() {
    this.light.off();
  }

  public void undo() {this.light.on();}
}
