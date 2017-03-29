package part_06;

/**
 * Created by tdavis on 3/28/17.
 */
public class ExMath {

    private String typeOfMath;
    private int startingNum;

    public ExMath() {
    }

    public ExMath(String typeOfMath, int startingNum) {
        this.typeOfMath = typeOfMath;
        this.startingNum = startingNum;
    }

    public String getTypeOfMath() {
        return typeOfMath;
    }

    public void setTypeOfMath(String typeOfMath) {
        this.typeOfMath = typeOfMath;
    }

    public int getStartingNum() {
        return startingNum;
    }

    public void setStartingNum(int startingNum) {
        this.startingNum = startingNum;
    }

    @Override
    public String toString() {
        return "ExMath{" +
                "typeOfMath='" + typeOfMath + '\'' +
                ", startingNum=" + startingNum +
                '}';
    }
}
