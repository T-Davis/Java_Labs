package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 3:
 *
 *      Read in a number in feet from the console
 *      and print out the corresponding length in meters
 *
 *      1 foot = .305 meter.
 */

public class Exercise_03 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of feet to convert to meters, then press enter ");
        double feet = input.nextDouble();
        double meters = feet * 0.305;

        System.out.print(feet + " feet equals " + meters + " meters");

    }
}
