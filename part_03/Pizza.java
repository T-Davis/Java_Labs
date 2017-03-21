package part_03;

/**
 * Created by tdavis on 3/21/17.
 */
public class Pizza {
    int size;
    String breadType;
    boolean delivery;
    Toppings toppings;

    Pizza(int size, String breadType, boolean delivery) {
        this.size = size;
        this.breadType = breadType;
        this.delivery = delivery;
    }
}

class Toppings {
    boolean pepperoni;
    boolean sausage;
    boolean veggies;
    boolean everything;

    public Toppings(boolean pepperoni, boolean sausage, boolean veggies, boolean everything) {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.veggies = veggies;
        this.everything = everything;
    }
}

class PizzaController {

    public static void main(String[] args) {
        Pizza firstPizza = new Pizza(12, "thick", true);
        Pizza secondPizza = new Pizza(8, "thin", false);
        firstPizza.toppings = new Toppings(true, false, true, false);
        System.out.println(firstPizza.size + " inches, " + firstPizza.breadType + " crust, delivery: " + firstPizza.delivery
        + "\nPepperoni: " + firstPizza.toppings.pepperoni + "\nSausage: " + firstPizza.toppings.sausage + "\nVeggies: " + firstPizza.toppings.veggies +
        "\nEverything: " + firstPizza.toppings.everything);
        secondPizza.toppings = new Toppings(true, true, true, true);
        System.out.println(secondPizza.size + " inches, " + secondPizza.breadType + " crust, delivery: " + secondPizza.delivery
        + "\nPepperoni: " + secondPizza.toppings.pepperoni + "\nSausage: " + secondPizza.toppings.sausage + "\nVeggies: " + secondPizza.toppings.veggies +
        "\nEverything: " + secondPizza.toppings.everything);
    }
}


