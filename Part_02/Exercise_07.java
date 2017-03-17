package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Want to know how many years and days you get by minutes?\nGive me them minutes!");
        int minutes = input.nextInt();

        minutesInTime(minutes);

    }


    private static void minutesInTime(int minutes) {

        int minutesInYear = 60*24*365;
        int minutesInDays = 60*24;
        int years = minutes/minutesInYear;
        int days = minutes%minutesInYear/minutesInDays;

        System.out.print(minutes + " minutes equals " + years + " years and " + days + " days");

    }

}

