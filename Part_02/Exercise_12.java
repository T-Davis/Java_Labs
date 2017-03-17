package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 23: - ryan
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */


public class Exercise_12 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("To calculate the cost of your trip we'll need the miles to drive, MPG of the" +
                " vehicle, and price per gallon of fuel. Press enter after each.");
        double milesToDrive = input.nextDouble();
        double milesPerGal = input.nextDouble();
        double priceOfFuel = input.nextDouble();

        investmentValue(milesToDrive, milesPerGal, priceOfFuel);

    }

    private static void investmentValue(double milesToDrive, double milesPerGal, double priceOfFuel) {

        System.out.println("Miles to drive = " + milesToDrive);
        System.out.println("Miles per gallon = " + milesPerGal);
        System.out.println("Price of fuel = $" + priceOfFuel);

        double pricePerMile = priceOfFuel/milesPerGal;
        double costOfTrip = pricePerMile*milesToDrive;

        System.out.print("Your trip will cost $" + costOfTrip);
    }
}