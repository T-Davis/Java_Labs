package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class CountAndPrint {

    public static void main(String[] args) {

        int countTo = 2017;
        int[] arr = new int[countTo];

        for (int i = 1; i <= countTo; i++) {
            arr[i - 1] = i;
        }

        for (int x = arr.length - 1; x >= 0; x -= 2) {
            System.out.print(arr[x] + ", ");
        }

    }
}