package AerialVehicles.UAVs;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;

public abstract class UAV extends AerialVehicle implements AerialIntelligenceVehicle {
    protected String cameraModel;

    public void flyTo(Coordinates coordinates){}
    public void hover(){}

    public void setMission(Mission mission) throws MissionTypeException {};
}
