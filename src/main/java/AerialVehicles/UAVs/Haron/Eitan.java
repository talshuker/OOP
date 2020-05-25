package AerialVehicles.UAVs.Haron;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends Haron {
    public Eitan() {
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if (mission instanceof BdaMission) {
            super.setMission(mission);
        }
        else{
            throw new MissionTypeException("this vehicle cannot preform this mission");
        }
    }
}
