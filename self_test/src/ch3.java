/**
 * Created by tdavis on 3/17/17.
 * 1. countSpaces
 * 2. if (this) {do this}
 * else if (this) {do this}
 * else {do this}
 * 3. if (y > 100)
 * 4. for (int x = 1000; x >= 0; x -= 2)
 * 5. no, i is declared inside loop, called outside
 * 6. break stops the loop and jumps the bottom of the code block, and a break
 * with a label jumps to that label (Ryan says do not use)
 * 7. after while
 * 8. i0 i1i2 i3i4 i5i6 ...
 * 9.forLoop
 * 10. getOtherCase
 */

import java.util.Scanner;

public class ch3 {

    public static void main(String[] args) {

        //answer 1. starts countSpaces method
        countSpaces();

        //answer 9. starts forLoop method
        //forLoop();

        //answer 10. starts getOtherCase method
        //getOtherCase();


    }

    public static void countSpaces() {

        //counts number of spaces
        int countSpaces;

        //listen for input
        // Scanner input = new Scanner(System.in);
        //String c = input.nextLine();

        //infinite loop to keep listening
        for (; ; ) {

            Scanner input = new Scanner(System.in);
            char c = input.next().charAt(0);

            //initialize countSpaces
            countSpaces = 0;

            //if space is entered, count it
            if (" ".equals(c)) countSpaces++;

            //if period entered, stop
            if (".".equals(c)) break;
        }

        //return count of spaces entered
        System.out.print("Spaces entered = " + countSpaces);
    }

    public static void forLoop() {

        //for loop iterates by multiplying itself by 2
        for (int x = 1; x < 100000; x += x) {

            //show iteration
            System.out.println(x);
        }
    }

    public static void getOtherCase() throws java.io.IOException {

        char ch;
        int changes = 0;

        System.out.println("Enter period to stop.");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            if (true) {}
        } while (true);
    }
}