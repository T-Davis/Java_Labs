package Part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] strings) {

        double h = 6.4;
        double w = 2.4;

        System.out.print("The perimeter of you parallelogram is " + ((h+w)*2) + "\n" +
                         "The area of your parallelogram is " + h*w);
    }
}
