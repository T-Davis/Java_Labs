package Part_01;

/**
 * Part 1 Exercise 8:
 *
 *      Write the necessary code that prints out the area
 *      and perimeter of a circle with a radius of 3.14
 *
 *
 */
public class Exercise_08 {

    private static final double radius = 3.14;

    public static void main(String[] args) {

        System.out.print("The circumference of your circle is " + 2*Math.PI*radius + "\nThe area of your circle is " + Math.PI*radius*radius);
    }
}
