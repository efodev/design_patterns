package pattern.command.receiver;

import javax.print.DocFlavor.INPUT_STREAM;

public class CeilingFan {
  String location;
  public static final int HIGH = 3;
  public static final int  MEDIUM = 2;
  public static final int  LOW = 1;
  public static final int OFF = 0;
  int speed;

  public CeilingFan(String location) {
    this.location = location;
    this.speed = OFF;
  }

  public String getLocation() {
    return this.location;
  }

  public void high() {
    this.speed = HIGH;
    System.out.println(this.location + "ceiling fan is on high speed");

  }
  public void medium() {
    this.speed = MEDIUM;
    System.out.println(this.location + "ceiling fain is on medium speed.");
  }

  public void low() {
    this.speed = LOW;
    System.out.println(this.location + "ceiling fan is on low speed.");
  }

  public void off() {
    this.speed = OFF;
    System.out.println(this.location + "ceiling fan is off.");
  }

  public int getSpeed() {
    return this.speed;
  }
}
