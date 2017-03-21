//package part_03;
//
///**
// * Created by tdavis on 3/20/17.
// */
//public class TimeToCook {
//    int numIngredients;
//    int numPortions;
//    double hoursToPrep;
//    int peopleToFeed;
//    String typeFood;
//
//    TimeToCook(int numIngredients, int numPortions, double hoursToPrep, int peopleToFeed, String typeFood) {
//        this.numIngredients = numIngredients;
//        this.numPortions = numPortions;
//        this.hoursToPrep = hoursToPrep;
//        this.peopleToFeed = peopleToFeed;
//        this.typeFood = typeFood;
//    }
//
//    public double difficulty() {
//        return (numIngredients + numPortions) * hoursToPrep / 10;
//    }
//
//    public double totalTime() {
//        return difficulty() * (numPortions/4/peopleToFeed);
//    }
//
//
//    public static void main(String[] args) {
//
//        Pizza pizza = new Pizza("perreroni", "mushrooms", "large");
//
//
//        TimeToCook pizzaTime = new TimeToCook(15, 8, 2, 10, "Italian");
//        System.out.println("It will take " + pizzaTime.totalTime() + " hours to make pizza for " + pizzaTime.peopleToFeed);
//
//        TimeToCook mashedPotatoes = new TimeToCook(4, 2, .5,4, "French");
//        System.out.println("It will take " + mashedPotatoes.totalTime() + " hours to make mashed potatoes for " +
//                "" + mashedPotatoes.peopleToFeed);
//
//
//    }
//
//}
//
//
//class Pizza {
//    String topping1;
//    String topping2;
//    String size;
//    TimeToCook cookingTime;
//
//    Pizza(String topping1, String topping2, String size) {
//        this.topping1 = topping1;
//        this.topping2 = topping2;
//        this.size = size;
//    }
//
//    public TimeToCook getCookingTime() {
//        return cookingTime;
//    }
//}