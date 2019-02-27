package Test3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SmartParkingBoy {

    /**
     * 停车男孩把一辆车停到3个停车场中空余停车位最多的停车场
     */

    @Test
    public void shouldParkInTheMostRestSpaceParkingLOTWhenBoyParkCar(){
        ParkingLot lot1 = new ParkingLot(3);
        ParkingLot lot2 = new ParkingLot(30);
        ParkingLot lot3 = new ParkingLot(5);
        List<ParkingLot> parkingLotList =new ArrayList<>();
        parkingLotList.add(lot1);
        parkingLotList.add(lot2);
        parkingLotList.add(lot3);
        SmartBoy boy = new SmartBoy();
        Car car = new Car();
        ParkingLot lot = boy.park(car,parkingLotList);
        Assert.assertEquals(lot,lot2);
    }
}
