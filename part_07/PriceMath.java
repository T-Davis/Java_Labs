package part_07;

/**
 * Created by tdavis on 3/29/17.
 */
public interface PriceMath {

    public int priceCatagory(int starLevel, boolean pool, boolean restaurant);

    public double weekendRateMultiplier(boolean businessHeavy);

    public double weekdayRateMultiplier(boolean businessHeavy);
}
