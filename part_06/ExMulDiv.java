package part_06;

/**
 * Created by tdavis on 3/28/17.
 */
public class ExMulDiv extends ExAddSub {

    private int mul;
    private double div;

    public ExMulDiv() {
    }

    public ExMulDiv(int add, int sub, int mul, double div) {
        super(add, sub);
        this.mul = mul;
        this.div = div;
    }

    public ExMulDiv(String typeOfMath, int startingNum, int add, int sub, int mul, double div) {
        super(typeOfMath, startingNum, add, sub);
        this.mul = mul;
        this.div = div;
    }

    public int mul(int x, int mulBy) {
        return x * mulBy;
    }

    public double div(int x , int divBy) {
        return x / divBy;
    }

    public int getMul() {
        return mul;
    }

    public void setMul(int mul) {
        this.mul = mul;
    }

    public double getDiv() {
        return div;
    }

    public void setDiv(double div) {
        this.div = div;
    }

    @Override
    public String toString() {
        return "ExMulDiv{" +
                "mul=" + mul +
                ", div=" + div +
                '}';
    }
}