package Part_02;


import java.util.Scanner;

/**
 * Part 2 Exercise 9:
 *
 *      Use a do-while loop to print out the letters of the alphabet in reverse order.
 *
 */
public class Exercise_09 {

    public static void main(String[] args) {

        revPrintAlph();

    }

    private static void revPrintAlph() {

        char alph = 'z';

        do {
            System.out.print(alph);
            alph--;
        } while (alph >= 'a');

    }
}