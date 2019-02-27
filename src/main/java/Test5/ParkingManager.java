package Test5;

import java.util.List;

public class ParkingManager {
    List<ParkBoy> boyList ;
    public ParkingManager(List<ParkBoy> boyList) {
        this.boyList = boyList;
    }

    public ParkingManager() {

    }

    public Card manageBoyPark(Car car) {

        return  boyList.get(0).park(car);
    }

    public Card park(Car car) {
        return new Card();
    }
}
