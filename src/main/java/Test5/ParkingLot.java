package Test5;


import java.util.HashMap;


public class ParkingLot {
    private final float space;
    HashMap<Card, Car> list = new HashMap<>();
    private  float parked;
    public ParkingLot(int parked, int space) {
        this.space = space;
        this.parked = parked;
    }

    public Car getCar(Card card) {
        return list.get(card);
    }

    public Card park(Car car) {
        Card card = new Card();
        list.put(card,car);
        return card;
    }

    public float getUsedPercent() {
        return parked/space;
    }

}
