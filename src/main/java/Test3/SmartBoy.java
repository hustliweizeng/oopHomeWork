package Test3;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SmartBoy {
    List<ParkingLot> parkingLotList;
    HashMap<Integer,ParkingLot> lotSpace = new HashMap<>();
    public ParkingLot park(Car car, List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
        for (ParkingLot lot:parkingLotList){
            lotSpace.put(lot.getSpace(),lot);
        }
        Set<Integer> spceList = lotSpace.keySet();
        Integer max = Collections.max(spceList);

        return lotSpace.get(max);
    }
}
