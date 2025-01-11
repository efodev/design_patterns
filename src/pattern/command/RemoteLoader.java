package pattern.command;

import pattern.command.controller.RemoteControl;
import pattern.command.receiver.GarageDoor;
import pattern.command.receiver.Light;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    // CeilingFan ceilingFan = new CeilingFan("Living Room");
    // GarageDoor garageDoor = new GarageDoor("Garage");
  }

}
