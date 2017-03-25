package part_05;

/**
 * Write one class. This class must make use of an inner/nested class.
 * Within the nested class, set the instance variables
 * of the outer class.
 * Also, within the inner class, call at least two methods that have a return type of int.
 * Add these two ints together and set a final instance variable in the outer with this value.
 */

class Outer {

    private int one;
    private int two;
    public final int sum = addInts();

    public int addInts() { // is all this really necessary?
        Inner obj = new Inner();
        return obj.innerMeth();
    }

    class Inner {

        private int one = 12;
        private int two = 6;

        private int innerMeth() {
            return one + two;
        }
    }

    public static void main(String[] args) {

        Outer outerObj = new Outer();
        System.out.println(outerObj.addInts());

    }
}