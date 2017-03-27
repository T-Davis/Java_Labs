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

    public static Cat[] createCatArr(int size) {

        Cat catOne;



        Cat[] catArr = new Cat[size];
        for (int x = 0; x < catArr.length; x++) {

            catOne = new Cat();
            catOne.setSize(8);
            catOne.setColor("black");
            catOne.setSize(8);
            catOne.setType("fat");

            catArr[x] = catOne;
        }

        for (Cat y : catArr) System.out.println(y.toString());
        return catArr;


    }

    public static void main(String[] args) {

        Dog oneDog = new Dog();

        oneDog.setColor("brown");
        oneDog.setSize(10);
        oneDog.setType("lab");
        oneDog.setFleas(10);

        Cat[] firstCatArr = createCatArr(3);


    }

}

class Dog {

    private String type;
    private String color;
    private int size;
    private Fleas[] fleas;

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

    public Fleas[] getFleas() {
        return fleas;
    }

    public void setFleas(int size) {
        Fleas fleas = new Fleas();
        this.fleas = fleas.getFleas(size);
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

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}


class Fleas {

    public Fleas[] getFleas(int size) {

        Fleas[] fleas = new Fleas[size];
        for (int i = 0; i < size; i++) {
            fleas[i] = new Fleas();
        }

        return fleas;
    }
}