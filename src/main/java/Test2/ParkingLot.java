package Test2;


import java.util.HashMap;


public class ParkingLot {
    HashMap<Card,Car> list = new HashMap<>();
    public Car getCar(Card card) {
        return list.get(card);
    }

    public Card park(Car car) {
        Card card = new Card();
        list.put(card,car);
        return card;
    }
}
