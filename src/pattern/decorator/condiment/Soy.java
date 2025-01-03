package pattern.decorator.condiment;


import pattern.decorator.Beverage;
import pattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    super.setBeverage(beverage);
  }
  @Override
  public double cost() {
    return super.getBeverage().cost() + .15;
  }

  @Override
  public String getDescription() {
    return super.getBeverage().getDescription() + ", Soy";
  }
}

