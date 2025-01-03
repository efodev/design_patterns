package pattern.decorator;

public abstract class Beverage {
  String description = "Unknown Beverage";
  public String getDescription() {
    return this.description;
  }

  public abstract double cost();
  public void setDescription(String description) {
    this.description = description;
  }

}
