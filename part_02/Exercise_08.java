package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Pick a number between 0 and 1,000,000,000!");
        int num = input.nextInt();

        guessNum(num);

    }

    private static void guessNum(int num) {

        if (num >= 0 && num <= 1_000_000_000) {
            int i = 0;
            while (i != num) {
                i++;
            }
            System.out.print("Your number is " + i);
        }
        else {
            System.out.print("That is not a number between 0 and 1,000,000,000!");
        }

    }

//    private static void guessNum(int num) {
//
//        System.out.print("Ha! Your number is " + num + "!");
//
//    }

}