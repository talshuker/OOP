package AerialVehicles.UAVs.Hermes;

import AerialVehicles.UAVs.UAV;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends Hermes {
    public Zik() {
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException{
        if (mission instanceof AttackMission) {
            super.setMission(mission);
        }
        else{
            throw new MissionTypeException("this vehicle cannot preform this mission");
        }
    }
}
