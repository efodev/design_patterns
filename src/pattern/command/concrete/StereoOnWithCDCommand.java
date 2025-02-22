package pattern.command.concrete;

import pattern.command.Command;
import pattern.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command  {
  Stereo stereo;

  public StereoOnWithCDCommand(Stereo stereo) {
    this.stereo = stereo;
  }
  @Override
  public void execute() {
    this.stereo.on();
    this.stereo.setCD();
    this.stereo.setVolume(11);
  }

  @Override
  public void undo() {
    
  }
}
