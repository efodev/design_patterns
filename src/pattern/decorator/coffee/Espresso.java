package pattern.decorator.coffee;

import pattern.decorator.Beverage;

public class Espresso extends Beverage {

  public Espresso() {
    super.setDescription("Espresso");
  }
  @Override
  public double cost() {
    return 1.99;
  }
}
