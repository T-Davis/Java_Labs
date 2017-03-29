package part_07;

/**
 * Created by tdavis on 3/28/17.
 */
public class Hotel implements PriceMath{

    private boolean pool;
    private boolean restaurant;
    private int starLevel;
    private String brand;
    private boolean businessHeavy;

    public Hotel(boolean pool, boolean restaurant, int starLevel, String brand, boolean businessHeavy) {
        this.pool = pool;
        this.restaurant = restaurant;
        this.starLevel = starLevel;
        this.brand = brand;
        this.businessHeavy = businessHeavy;
    }

    public int priceCatagory(int starLevel, boolean pool, boolean restaurant) {
        int calc = starLevel;
        if (pool) calc++;
        if (restaurant) calc++;

        return calc;
    }

    public double weekendRateMultiplier(boolean businessHeavy) {
        if (businessHeavy) return 1;
        else return 1.5;
    }

    public double weekdayRateMultiplier(boolean businessHeavy) {
        if (businessHeavy) return 1.3;
        else return 1;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "pool=" + pool +
                ", restaurant=" + restaurant +
                ", starLevel=" + starLevel +
                ", brand='" + brand + '\'' +
                ", businessHeavy=" + businessHeavy +
                '}';
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    public int getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(int starLevel) {
        this.starLevel = starLevel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isBusinessHeavy() {
        return businessHeavy;
    }

    public void setBusinessHeavy(boolean businessHeavy) {
        this.businessHeavy = businessHeavy;
    }
}
