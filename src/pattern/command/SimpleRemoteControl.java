package pattern.command;

public class SimpleRemoteControl {
  // We have a slot to hold our command to control one device
  Command slot;
  public SimpleRemoteControl() {}

  /**
   * This method sets the command the slot is going to control.
   * This could be called multiple times if th client code wanted to change b
   * @param command
   */
  public void setCommand(Command command) {
    slot = command;
  }

  /**
   * This method is called when the button is pressed.
   * All we do is take the current command bound to the slotand call its execute method.
   */
  public void buttonWasPressed() {
    slot.execute();
  }

}
