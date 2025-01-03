package pattern.decorator.coffee;

import pattern.decorator.Beverage;

public class Decaf extends Beverage {

  public Decaf() {
    super.setDescription("Decaffeinated Coffee");
  }

  @Override
  public double cost() {
    return 1.05;
  }
}
