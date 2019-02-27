package Test5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ParkingManagerTest {
    /**
     * 1.1个停车场经理管理3个停车员，每个停车员可以停车
     * 2.1个停车场经理自己可以停车
     */
    @Test
    public void sholdReturnCardWhenManagerParkGiveOneCar(){

        List<ParkBoy> boyList  = new ArrayList<>();
        boyList.add(new ParkBoy());
        boyList.add(new ParkBoy());
        boyList.add(new ParkBoy());
        //停车场经理管理3个停车员
        ParkingManager manager = new ParkingManager(boyList);
        Car car = new Car();
        //管理员指挥停车
        Card card = manager.manageBoyPark(car);
        Assert.assertNotNull(card);

    }
    @Test
    public void shouldReturnCardWhenManagerParkOneCar(){
        ParkingManager manager = new ParkingManager();
        Car car = new Car();
        Card card = manager.park(car);
        Assert.assertNotNull(card);
    }
}
