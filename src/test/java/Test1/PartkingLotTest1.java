package Test1;

import org.junit.Assert;
import org.junit.Test;

public class PartkingLotTest1 {

    /**
     * 1.停车场停车
     * 2.停车场取车
     */
    @Test
    public void shouldReturnCardWhenGiveCar(){
        ParkingLot parkingLot = new ParkingLot();
        Car car = new Car();
        ParkingCard card= parkingLot.park(car);
        Assert.assertNotNull(card);
    }
    @Test
    public void shouldReturnCarWhenGiveCard(){
        ParkingLot parkingLot = new ParkingLot();
        Car carIn = new Car();
        ParkingCard card= parkingLot.park(carIn);
        Car carOut = parkingLot.getCarByCard(card);
        Assert.assertSame(carIn,carOut);
    }

}
