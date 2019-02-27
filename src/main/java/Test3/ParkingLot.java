package Test3;


import java.util.HashMap;


public class ParkingLot {
    private final int space;
    HashMap<Card, Car> list = new HashMap<>();

    public ParkingLot(int space) {
        this.space = space;
    }

    public Car getCar(Card card) {
        return list.get(card);
    }

    public Card park(Car car) {
        Card card = new Card();
        list.put(card,car);
        return card;
    }

    public int getSpace() {
        return space;
    }
}
