package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */

class DoingItAgain {

    public static void main(String[] args) {

        String[] printArr = new String[] {"no", "less", "than", "five", "words"};
        for (String x : printArr) System.out.print(x + " ");
    }
}