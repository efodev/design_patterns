package pattern.decorator;

import pattern.decorator.coffee.DarkRoast;
import pattern.decorator.coffee.Espresso;
import pattern.decorator.coffee.HouseBlend;
import pattern.decorator.condiment.Mocha;
import pattern.decorator.condiment.Soy;
import pattern.decorator.condiment.Whip;

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage espresso =  new Espresso(); //order an espresso, no condiments and print receipt.
    System.out.println(espresso.getDescription() + " $"+ espresso.cost());

    Beverage coffee = new DarkRoast(); // make a darkRoast object
    coffee = new Mocha(coffee); // wrap it with a Mocha
    coffee = new Mocha(coffee); // wrap it with a second Mocha
    coffee = new Whip(coffee); // wrap it in a whip
    System.out.println(coffee.getDescription() + " $" + coffee.cost());

    Beverage coffee2 = new HouseBlend();
    coffee2 = new Soy(coffee2);
    coffee2 = new Mocha(coffee2);
    coffee2 = new Whip(coffee2);
    System.out.println(coffee2.getDescription() + " $" + coffee2.cost());

  }
}
