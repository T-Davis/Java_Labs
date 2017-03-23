package part_04;

import java.util.Scanner;

/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class PrintArray {
    public static void main(String[] args) {

       // System.out.println("enter an integer and press enter");
        int[] fromUser = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "/10 Enter an integer and press enter");

            Scanner input = new Scanner(System.in);
            fromUser[i] = input.nextInt();

        }

        for (int i = 1; i < 4; i += 2) {
            System.out.print(fromUser[i] + ", ");
        }

        for (int i = fromUser.length -1; i > 0; i -= 2) {
            System.out.print(fromUser[i-1] + ", ");

        }




//        System.out.println("enter digits and press enter");
//        Scanner input = new Scanner(System.in);
//        String userStr = input.nextLine();
//        String[] charsToParse = userStr.split("");
//
//        for (int i = 1; i < charsToParse.length; i +=2) {
//            System.out.print(charsToParse[i]);
//        }
//
//        int x;
//        if (charsToParse.length % 2 == 0) x = 2;
//        else x = 1;
//
//        for (int i = charsToParse.length - x; i >= 0; i -= 2) {
//            System.out.print(charsToParse[i]);
//        }


    }
}