package AerialVehicles.UAVs;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;
import Missions.IntelligenceMission;


public abstract class UAV extends AerialVehicle implements AerialIntelligenceVehicle {
    protected String sensorType;

    public void flyTo(Coordinates coordinates){}

    public void hover(){
        System.out.println(getPilotName() + ": " + this.getClass().getSimpleName() + " Hovering...." + getMission().getCoordinates());
    }

    @Override
    public void collectIntelligence(){
        System.out.println(getPilotName() + ": " + this.getClass().getSimpleName() +
                " Collecting Data in " + ((IntelligenceMission)this.getMission()).getRegion() +
                getSensorType());
    }

    public String getSensorType() {
        return sensorType;
    }
}
