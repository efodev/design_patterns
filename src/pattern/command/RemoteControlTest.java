package pattern.command;

import pattern.command.concrete.GarageDoorOpenCommand;
import pattern.command.concrete.LightonCommand;
import pattern.command.controller.SimpleRemoteControl;
import pattern.command.receiver.GarageDoor;
import pattern.command.receiver.Light;

public class RemoteControlTest {

  public static void main(String[] args) {
    // remote is the invoker of our command; It will be passed a command object that can be used to make request.
    SimpleRemoteControl remote = new SimpleRemoteControl();
    // light is the receiver of the command
    Light light = new Light("light");
    // create a command and pass in the receiver
    LightonCommand lighton = new LightonCommand(light);
    GarageDoor garageDoor = new GarageDoor("Garage");
    GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

    remote.setCommand(lighton); // pass command to the invoker
    remote.buttonWasPressed(); // simulate the button being pressed.
    remote.setCommand(garageOpen);
    remote.buttonWasPressed();
    



  }
}
