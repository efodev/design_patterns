package pattern.command;

import pattern.command.concrete.LightoffCommand;
import pattern.command.concrete.LightonCommand;
import pattern.command.controller.RemoteControl;
import pattern.command.receiver.GarageDoor;
import pattern.command.receiver.Light;
import pattern.command.receiver.Stereo;

public class RemoteLoader {

  public static void main(String[] args) {
    RemoteControl remoteControl = new RemoteControl();

    // Create all the devices in their proper location
    Light livingRoomLight = new Light("Living Room");
    Light kitchenLight = new Light("Kitchen");
    GarageDoor garageDoor = new GarageDoor("Garage");
    Stereo stereo = new Stereo("Living Room");

    // Create the all the Light Command objects
    LightonCommand livingRoomLighton = new LightonCommand(livingRoomLight);
    LightoffCommand livingRoomlightoff = new LightoffCommand(livingRoomLight);
    LightonCommand kitchenLighton = new LightonCommand(kitchenLight);
    LightoffCommand kitchenLightoff = new LightoffCommand(kitchenLight);

    // supposed to create command for GarageDoor and Stereo, but I'm getting tired of this repetitive code

    remoteControl.setCommands(0, livingRoomLighton, livingRoomlightoff);
    remoteControl.setCommands(1, kitchenLighton, kitchenLightoff);
    System.out.println(remoteControl);

    // set stuffs on
    for (int i = 0; i < 2; i++) {
      remoteControl.onButtonWasPushed(i);
      remoteControl.offButtonWasPushed(i);
    }
  }

}
