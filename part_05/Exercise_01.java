package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Class1 {

    int class2var1 = 11;
    int class2var2 = 12;

    public static void main(String[] args) {

        Class2 class2obj1 = new Class2();


    }
}

class Class2 {

    private int class2var1 = 21;
    private int class2var2 = 22;
    private int class2var3 = 23;
    private int class2var4 = 24;

//    Class3 newclass3 = new Class3;

}

class Class3 {

    private int class3var1 = 31;
    private int class3var2 = 32;
    private int class3var3 = 33;
    private int class3var4 = 34;

}