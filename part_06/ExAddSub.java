package part_06;

/**
 * Created by tdavis on 3/28/17.
 */
public class ExAddSub extends ExMath {

    private int add;
    private int sub;

    public ExAddSub() {
    }

    public ExAddSub(int add, int sub) {
        this.add = add;
        this.sub = sub;
    }

    public ExAddSub(String typeOfMath, int startingNum, int add, int sub) {
        super(typeOfMath, startingNum);
        this.add = add;
        this.sub = sub;
    }

    public int add(int x, int addBy) {
        return x + addBy;
    }

    public int sub(int x, int subBy) {
        return x - subBy;
    }

    public int getAdd() {
        return add;
    }

    public void setAdd(int add) {
        this.add = add;
    }

    public int getSub() {
        return sub;
    }

    public void setSub(int sub) {
        this.sub = sub;
    }

    @Override
    public String toString() {
        return "ExAddSub{" +
                "add=" + add +
                ", sub=" + sub +
                '}';
    }
}
