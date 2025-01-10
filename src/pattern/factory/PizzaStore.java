package pattern.factory;

public abstract class PizzaStore {

  public Pizza order(String type) {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    System.out.println("Your order is reading. Thanks for ");
    return pizza;
  }

  abstract Pizza createPizza(String type);

}
