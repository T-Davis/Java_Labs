package part_03;


import java.util.Scanner;

/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {

        // read an integer from the user >=1 and <= 999,999,999
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 999,999,999");
        int userNum = input.nextInt();


        // use the && operator to see if the user's number is divisible by both 4 and 7
        boolean bothNums = (userNum % 4 == 0 && userNum % 7 == 0);

        // use the || operator to see if the user's number is divisible by 4 or 7
        boolean orNums = (userNum % 4 == 0 || userNum % 7 == 0);


        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        boolean xorNums = (userNum % 4 == 0 ^ userNum % 7 == 0);

        // print out the results
        System.out.println("Your number divisible by both 4 and 7: " + bothNums +
        "\nYour number divisible by 4 or 7: " + orNums +
        "\nYour number only divisible by 4 or 7: " + xorNums);
    }
}
