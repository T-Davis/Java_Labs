/**
 * Created by tdavis on 3/16/17.
 * 1. for performance and control
 * 2. char, it includes all unicode characters instead of just the ascii ones
 * 3. false
 * 4. System.out.println("One\nTwo\nThree")
 * 5. sum is defined in the scope and called outside
 * 6. prefix increments before the operator ++x, postfix evaluates after the operator x++
 * 7. x != 0 && x < 100
 * 8. int
 * 9. when you need your variable to be an unrelated type or moving smaller int -> short
 * 10. code follows
 * 11. no
 * 12. yes
 */
public class ch2 {

    public static void main(String[] args) {

        int notPrime = 0;

        for (int i = 2; i <= 100; i++) {

            notPrime = 0;

            for (int j = 2; j <= i; j++) {

                if (i % j == 0) {

                    notPrime++;
                }
            }

            if (notPrime == 1) {
                System.out.println(i + " is prime");
            }
        }
    }
}
