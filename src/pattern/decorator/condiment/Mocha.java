package pattern.decorator.condiment;

import pattern.decorator.Beverage;
import pattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    super.setBeverage(beverage);
  }
  @Override
  public double cost() {
    return super.getBeverage().cost() + .20;
  }

  @Override
  public String getDescription() {
    return super.getBeverage().getDescription() + ", Mocha";
  }
}
