package Part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) throws java.io.IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me a number 1 - 9");
        int num = input.nextInt();

        printNumberInWord(num);

        }


    private static void printNumberInWord(int num) {

        if (num > 0 && num < 10) {
            if (num == 1) System.out.print("ONE");
            if (num == 2) System.out.print("TWO");
            if (num == 3) System.out.print("THREE");
            if (num == 4) System.out.print("FOUR");
            if (num == 5) System.out.print("FIVE");
            if (num == 6) System.out.print("SIX");
            if (num == 7) System.out.print("SEVEN");
            if (num == 8) System.out.print("EIGHT");
            if (num == 9) System.out.print("NINE");
        }

        else {
            System.out.print("OTHER");
        }
    }

}