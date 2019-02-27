package Test5;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class SmartBoy {
    List<ParkingLot> parkingLotList;
    HashMap<Float, ParkingLot> lotSpace = new HashMap<>();
    public ParkingLot park(Car car, List<ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
        for (ParkingLot lot:parkingLotList){
            lotSpace.put(lot.getUsedPercent(),lot);
        }
        Set<Float> spceList = lotSpace.keySet();
        Float max = Collections.max(spceList);

        return lotSpace.get(max);
    }
}
