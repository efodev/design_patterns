package pattern.decorator;

public abstract class CondimentDecorator extends Beverage{
   Beverage beverage;
   public abstract String getDescription();
   public void setBeverage(Beverage beverage) {
      this.beverage = beverage;
   }

   public Beverage getBeverage() {
      return this.beverage;
   }

}
