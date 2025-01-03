package pattern.decorator.condiment;


import pattern.decorator.Beverage;
import pattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

  public Whip(Beverage beverage) {
    super.setBeverage(beverage);
  }
  @Override
  public double cost() {
    return super.getBeverage().cost() + .10;
  }

  @Override
  public String getDescription() {
    return super.getBeverage().getDescription() + ", Whip";
  }
}

