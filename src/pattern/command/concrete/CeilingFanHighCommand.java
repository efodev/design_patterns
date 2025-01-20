package pattern.command.concrete;

import pattern.command.Command;
import pattern.command.receiver.CeilingFan;


public class CeilingFanHighCommand implements Command {
  CeilingFan ceilingFan;
  int prevSpeed;

  public CeilingFanHighCommand(CeilingFan ceilingFan) {
    this.ceilingFan = ceilingFan;
  }
  @Override
  public void execute() {
    this.prevSpeed = this.ceilingFan.getSpeed();
    ceilingFan.high();
  }

  @Override
  public void undo() {
    if (this.prevSpeed == this.ceilingFan.HIGH) {
      this.ceilingFan.high();
    } else if (this.prevSpeed == this.ceilingFan.MEDIUM) {
      this.ceilingFan.medium();
    } else if (this.prevSpeed == this.ceilingFan.LOW) {
      this.ceilingFan.low();
    } else if (this.prevSpeed == this.ceilingFan.OFF) {
      this.ceilingFan.off();
    }
  }
}
