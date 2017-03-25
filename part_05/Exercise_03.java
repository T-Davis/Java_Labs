package part_05;

/**
 * Write two classes.
 * In Class_01 have a main method that creates on instance of Class_02.
 * In Class_02, demonstrate method overloading. You must overload a method a least 3 times.
 * Each method should have a return type that is not void.
 * Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution.
 * You can name these classes whatever you want.
 */

class Over1 {

    public static void main(String[] args) {

        Over2 testing = new Over2();

        System.out.println(testing.methOver(2, 4));
        System.out.println(testing.methOver('a', 'D'));
        System.out.println(testing.methOver(2.4, 4.8));


    }
}

class Over2 {


    public double methOver(int a, int b) {
        return a * b;
    }

    public char methOver(char a, char b) {
        return 'a' * 'b';
    }

    public double methOver(double a, double b) {
        return a * b;
    }
}