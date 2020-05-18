package AerialVehicles.UAVs.Haron;

import AerialVehicles.UAVs.UAV;

public abstract class Haron extends UAV {


    @Override
    public void check() {
        if (this.getHoursOfFlightSinceLastRepair() >= 150){
            this.repair();
        }
    }
}
