package part_06;

/**
 * Created by tdavis on 3/28/17.
 */
public class ExPer extends ExMulDiv {

    private double per;

    public ExPer() {
    }

    public ExPer(int add, int sub, int mul, double div, double per) {
        super(add, sub, mul, div);
        this.per = per/100;
    }

    public ExPer(String typeOfMath, int startingNum, int add, int sub, int mul, double div, double per) {
        super(typeOfMath, startingNum, add, sub, mul, div);
        this.per = per/100;
    }

    public double per(int x , int perOf) {
        return x / perOf;
    }

    public int add(int x, int y) {
        return 345678;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "ExPer{" +
                "per=" + per +
                '}';
    }

    public static void main(String[] args) {
        //ex1
        ExPer inheritance = new ExPer();
        System.out.println(inheritance.add(10, 20));
        //ex2
        inheritance.setAdd(5);
        inheritance.setMul(5);
        System.out.println(inheritance.mul(inheritance.getAdd(), inheritance.getMul()));
        //ex3
        ExPer ex3 = new ExPer("all", 100, 2, 4, 10, 5, 50);
        System.out.println(ex3.toString());

        ExMath iCanBeAnything = new ExMath("Super", 400);
        System.out.println(iCanBeAnything.toString());
        iCanBeAnything = ex3;
        System.out.println(iCanBeAnything.toString());
    }
}
