package Part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {

        int population = 380_123_456;
        int secondsInYear = 365*24*60*60;
        int bornInYear = secondsInYear/6;
        int diesInYear = secondsInYear/12;
        int immigratesInYear = secondsInYear/40;
        int yearsToCount = 3;
        int currentYear = 2017;

        while (yearsToCount > 0) {
            population += bornInYear + immigratesInYear - diesInYear;
            yearsToCount--;
            currentYear++;
            System.out.printf("In the year " + currentYear + ", the total population will be " + "%,d\n", population);
        }


    }
}
