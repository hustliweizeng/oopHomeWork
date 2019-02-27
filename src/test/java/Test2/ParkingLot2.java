package Test2;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot2 {

    /**
     * 1.停车小弟按顺序停放3辆车到3个停车场
     * 2.停车小弟凭停车卡取出指定车辆
     */

    @Test
    public void ParkingLotShouldReturnTicketWhenParkingBoyGiveCar(){
        //3个停车场
        List<ParkingLot> parkList = new ArrayList<>();
        ParkingLot parkingLot1 = new ParkingLot();
        ParkingLot parkingLot2 = new ParkingLot();
        ParkingLot parkingLot3 = new ParkingLot();
        parkList.add(parkingLot1);
        parkList.add(parkingLot2);
        parkList.add(parkingLot3);
        //3辆车
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        //停车小弟按顺序停车
        GraduateParkingBoy boy= new GraduateParkingBoy();
        ArrayList<Card> cardList = boy.park(carList, parkList);
        Assert.assertNotNull(cardList);
    }
    @Test
    public void ParkingLotShouldReturnCarWhenParkingBoyGiveCard(){
        //3个停车场
        List<ParkingLot> parkList = new ArrayList<>();
        ParkingLot parkingLot1 = new ParkingLot();
        ParkingLot parkingLot2 = new ParkingLot();
        ParkingLot parkingLot3 = new ParkingLot();
        parkList.add(parkingLot1);
        parkList.add(parkingLot2);
        parkList.add(parkingLot3);
        //3辆车
        List<Car> carList = new ArrayList<>();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        //停车小弟按顺序停车
        GraduateParkingBoy boy= new GraduateParkingBoy();
        ArrayList<Card> cardList = boy.park(carList, parkList);

        //取出指定车辆
        Assert.assertEquals(carList,boy.getCarByCard(cardList));
    }
}
