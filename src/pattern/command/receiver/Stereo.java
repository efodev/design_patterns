package pattern.command.receiver;

public class Stereo {
  String location;
  public Stereo(String location) {
    this.location = location;
  };

  public void on() {
    System.out.println("Stereo is on.");
  }
  public void off() {
    System.out.println("Stereo is off.");
  }

  public void setCD() {
    System.out.println("Stereo CD is set.");
  }

  public void setDVD() {
    System.out.println("Stereo DVD is set.");
  }

  public void setRadio() {
    System.out.println("Stereo Radio is set.");
  }

  public void setVolume(int level) {}

}
