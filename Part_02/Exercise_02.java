package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 2:
 *
 *      Write the necessary code that reads the radius
 *      and the length of a cylinder from the console
 *      then computes the volume and area and prints the
 *      results to the console.
 *
 *      tip: area = radius * radius * 3.1415 (roughly)
 */
public class Exercise_02 {

    public static void main(String[] args) throws java.io.IOException {
        double area, volume;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        area = (2 * Math.PI * radius*length) + (2 * Math.PI * radius * radius);
        volume = Math.PI * radius * radius * length;

        System.out.print("Your cylinder has a surface area of " + area + "\n" +
                "and a volume of " + volume);
    }
}
