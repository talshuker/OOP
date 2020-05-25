package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.UAVs.UAV;
import Missions.BdaMission;

public abstract class Hermes extends UAV implements AerialBdaVehicle {
    private static final int MAX_HOURS_AFTER_REPAIR = 100;
    String cameraType;

    @Override
    public void preformBda() {
        System.out.println(this.getPilotName() + ": " + this.getClass().getSimpleName() +
                " taking pictures of " + ((BdaMission) this.getMission()).getObjective() +
                this.getCameraType());
    }

    @Override
    public void check() {
        if (this.getHoursOfFlightSinceLastRepair() >= MAX_HOURS_AFTER_REPAIR){
            this.repair();
        }
    }

    public String getCameraType() {
        return this.cameraType;
    }
}
