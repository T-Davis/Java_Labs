package part_05;

/**
 * Write three classes.
 * The Class_01 should contain the main method.
 * The main method should create an instance of Class_02.
 * Class_02 must have several private instance variables.
 * Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables.
 * Use Class_02 to set the private variables within Class_03.
 * Please note, do not use the constructor of any of these classes to set the private instance variables.
 * Use System.out.println at various points to demonstrate the flow of execution and
 *  the varying state of each private variable.
 * You may name these classes whatever you like.
 */

class Chase {

    public static void main(String[] args) {

        Dog oneDog = new Dog();

        oneDog.setColor("brown");
        oneDog.setSize(10);
        oneDog.setType("lab");

         Cat[] firstCatArr = oneDog.createCatArr(3);
    }
}

class Dog {

    private String type;
    private String color;
    private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public Cat[] createCatArr(int size) {

        Cat[] catArr = new Cat[size];

//        catOne.setSize(8);
//        catOne.setColor("black");
//        catOne.setSize(8);
//        catOne.setType("fat");
        return catArr;
    }

}

class Cat {

    private String type;
    private String color;
    private int size;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

