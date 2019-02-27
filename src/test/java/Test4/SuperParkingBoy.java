package Test4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SuperParkingBoy {
    /**
     * 停车男孩把一辆车停到3个停车场中空置率最高的停车场
     */

    @Test
    public void shouldParkInTheMostRestSpaceParkingLOTWhenBoyParkCar(){
        ParkingLot lot1 = new ParkingLot(3,10);
        ParkingLot lot2 = new ParkingLot(30,40);
        ParkingLot lot3 = new ParkingLot(5,6);
        List<ParkingLot> parkingLotList =new ArrayList<>();
        parkingLotList.add(lot1);
        parkingLotList.add(lot2);
        parkingLotList.add(lot3);
        SmartBoy boy = new SmartBoy();
        Car car = new Car();
        ParkingLot parkedLot = boy.park(car,parkingLotList);
        Assert.assertEquals(parkedLot,lot3);
    }
}
