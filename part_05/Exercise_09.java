package part_05;

/**
 * Demonstrate how variable-arity works, aka varargs. Create a method that uses "String ... varargs". Within the
 * varargs method, use StringBuilder to build a nicely formatted String/sentence using the varargs. Print this statement
 * to the console. Do this at least 3 times with different Strings/sentences.
 */


class VarargsClass {


    void print1(String...first) {

        StringBuilder str1 = new StringBuilder();
        str1.append("print1 prints:");

        for (String x: first) {
            str1.append(" " + x);
        }

        str1.append("!\n");
        System.out.println(str1);
    }

    void print2(String...first) {

        StringBuilder str1 = new StringBuilder();

        int count = 1;
        for (String x: first) {
            str1.append("Item " + count + ": " + x + "\n");
            count++;
        }

        System.out.println(str1);
    }

    void print3(String...first) {

        StringBuilder str1 = new StringBuilder();
        str1.append("print1 prints:");

        for (String x: first) {
            str1.append(" " + x);
        }

        str1.append("!");
        System.out.println(str1);
    }


    public static void main(String[] args) {

        VarargsClass printStuff = new VarargsClass();

        printStuff.print1("Print", "all", "the", "things");
        printStuff.print2("This", "is", "a", "list");
        printStuff.print3("Print", "all", "the", "things");

    }
}