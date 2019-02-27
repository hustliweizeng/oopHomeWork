package Test1;

import javax.smartcardio.Card;

import java.util.HashMap;


public class ParkingLot {
    HashMap<ParkingCard,Car> list  = new HashMap();
    public ParkingCard park(Car car) {
        ParkingCard parkingCard = new ParkingCard();
        list.put(parkingCard,car);
        return parkingCard;
    }

    public Car getCarByCard(ParkingCard card) {
        return list.get(card);
    }
}
