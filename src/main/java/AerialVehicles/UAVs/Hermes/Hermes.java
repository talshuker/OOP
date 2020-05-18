package AerialVehicles.UAVs.Hermes;

import AerialVehicles.UAVs.UAV;

public abstract class Hermes extends UAV {

    @Override
    public void check() {
        if (this.getHoursOfFlightSinceLastRepair() >= 100){
            this.repair();
        }
    }
}
