package Part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {

        int num = 100;

        findPrimes(num);

    }

    private static void findPrimes(int num) {

        for (int i = 2; i <= num; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i/j; j++) {

                if (i % j == 0) isPrime = false;
            }

            if (isPrime) System.out.println(i);
        }


    }
}