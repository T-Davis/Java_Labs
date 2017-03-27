/**
 * Created by tdavis on 3/27/17.
 *
 * 1. no
 * 2. see code
 * 3. private
 * 4. access constructor or access member of super class
 * 5. a b g
 * 6. needs review, when an overriden method is called through a superclass reference, it is the type of the object
 *  being referred to that determines which version of the method is called
 * 7. a public class that extends methods that can be, but do not have to be, used by a subclass, ie provides a template
 * 8. final
 * 9.
 * 10. Object class
 * 11. true
 * 12. final
 *
 */
public class ch7 {
}

//Question 2
class TwoDShape9 {
    private double width;
    private double height;
    private String name;

    TwoDShape9() {
        width = height = 0.0;
        name = "none";
    }

    TwoDShape9(double w, double h, String n) {
        width = w;
        height = h;
        name = n;
    }

    TwoDShape9(double x, String n) {
        width = height = x;
        name = n;
    }

    TwoDShape9(TwoDShape9 ob) {
        width = ob.width;
        height = ob.height;
    }

    double getWidth() { return width; }
    double getHeight() { return height; }
    void setWidth(double w) { width = w; }
    void setHeight(double h) { height = h; }

    String getName() { return name; }

    void showDim() {
        System.out.println("Width and height are " +
                width + " and " + height);
    }

    double area() {
        System.out.println("area() must be overridden");
        return 0.0;
    }
}

class DynShapes {
    public static void main(String args[]) {

            Circle testCircle = new Circle(10, "Circle");
            System.out.println("The area of testCircle is " + testCircle.area());
        }
    }

class Circle extends TwoDShape9 {

    Circle(double x, String n) {
        super(x, n);
    }

    double area() {
        return Math.PI * ((getWidth() / 2) * (getWidth() / 2));
    }
}
