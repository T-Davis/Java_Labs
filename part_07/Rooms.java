package part_07;

/**
 * Created by tdavis on 3/28/17.
 */
public class Rooms extends Hotel {

    private int floorNum;
    private int roomNum;
    private int size;

    public Rooms(boolean pool, boolean restaurant, int starLevel, String brand,
                 boolean businessHeavy, int floorNum, int roomNum, int size) {
        super(pool, restaurant, starLevel, brand, businessHeavy);
        this.floorNum = floorNum;
        this.roomNum = roomNum;
        this.size = size;
    }


}
