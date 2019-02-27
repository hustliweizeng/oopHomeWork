package Test4;

import java.util.ArrayList;
import java.util.List;

public class SmartParkingBoy {
    List<ParkingLot> parkList ;
    public ArrayList<Card> park(List<Car> carList, List<ParkingLot> parkList) {
        this.parkList = parkList;
        ArrayList<Card> listCard = new ArrayList<>();
        for (int carSize=0;carSize< carList.size();carSize++){
            int lotSize = parkList.size();
            Car car = carList.get(carSize);
            Card card = parkList.get(carSize / lotSize).park(car);
            listCard.add(card);

        }
        return listCard;
    }
    public ArrayList<Car> getCarByCard(List<Card> list){
        ArrayList<Car> carList = new ArrayList<>();
        for (Card card:list){
            for (ParkingLot lot:parkList){
                Car car = lot.getCar(card);
                if (car!=null){
                    carList.add(car);
                }
            }
        }

        return  carList;
    }


}
