package pattern.command.concrete;

import pattern.command.Command;
import pattern.command.receiver.Light;

/**
 * The light on Command implements the Command Interface
 */
public class LightonCommand implements Command {
  Light light;

  /**
   * The constructor is passed the specific light that the command is going to control
   * and stashes it in the light instance variable. When execute gets called, this light object will ge the receiver of the request.
   * @param light specific light instance the light will control
   */
  public LightonCommand(Light light) {
    this.light = light;
  }
  @Override
  /**
   * Calls the on() method of receiving object, which is the light object we are controlling.
   */
  public void execute() {
    this.light.on();
  }
}
