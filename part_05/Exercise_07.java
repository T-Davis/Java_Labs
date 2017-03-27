package part_05;

/**
 * Write two classes. Class_01 should have the main().
 * Class_02 should have various instance variables. At least one of must be static.
 * Within class_01 create at least 3 instances of class_02.
 * Set the instance variables of class_02.
 * Then, just once, in one place, set the static instance variable in class_02.
 * Afterwards, print out the value of each instance variable and the static variable for each class.
 */

class Run {

    public static void main(String[] args) {

        App one = new App();

        one.setName("app1");
        one.setSize(1);
        App.setDownloaded(true);

        System.out.println(one.toString());

        App two = new App();

        two.setName("app2");
        two.setSize(2);

        System.out.println(two.toString());

        App three = new App();

        three.setName("app3");
        three.setSize(3);

        System.out.println(three.toString());
    }
}

class App {

    private String name;
    private double size;
    private static boolean downloaded;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean getDownloaded() {
        return downloaded;
    }

    public static void setDownloaded(boolean dl) {
        downloaded = dl;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", downloaded=" + downloaded +
                '}';
    }
}