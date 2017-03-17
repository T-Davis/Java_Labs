package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);

        System.out.print("Input number of pounds to convert to kilos, then press enter ");
        double pounds = input.nextDouble();
        double kilos = pounds * 0.454;

        System.out.print(pounds + " pounds equals " + kilos + " kilos");

    }
}