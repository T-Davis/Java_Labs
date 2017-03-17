package Part_02;


import java.util.Scanner;

/**
 Part 2 Exercise 21:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 */
public class Exercise_11 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("To calculate your investment value type your investment amount then" +
                "press enter, your percentage then enter, years to invest then enter");
        int invAmt = input.nextInt();
        int intRate = input.nextInt();
        int yearsInv = input.nextInt();

        investmentValue(invAmt, intRate, yearsInv);

    }

    private static void investmentValue(int invAmt, int intRate, int yearsInv) {

        System.out.println("Investment amount = " + invAmt);
        System.out.println("Interest rate = " + intRate);
        System.out.println("Number of years to invest = " + yearsInv);

        double invPercent = (double)intRate/100+1;
        double invVal = invAmt;
        while (yearsInv > 1) {
            invVal = invVal*invPercent;
            System.out.println("Your investment by year is " + (int)invVal);
            yearsInv--;

        }
    }
}