package pattern.decorator.coffee;

import pattern.decorator.Beverage;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    super.setDescription("Dark Roast Coffee");
  }

  @Override
  public double cost() {
    return .99;
  }
}
