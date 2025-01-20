package pattern.command.receiver;

public class GarageDoor {
  String location;

  public GarageDoor(String location) {
    this.location = location;
  }
  public void up() {
    System.out.println("Garage door is up.");
  }
  public void down() {
    System.out.println("Garage door is down.");
  }
  public void stop() {
    System.out.println("Garage stops");
  }

  public void lightOn() {

  }

  public void lightOff() {

  }
  public void open() {
    System.out.println("Garage door is open.");
  }
}
