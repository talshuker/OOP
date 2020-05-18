package AerialVehicles.UAVs.Hermes;

import AerialVehicles.UAVs.UAV;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Zik extends Hermes {


    @Override
    public void setMission(Mission mission) throws MissionTypeException{
        if (!(mission instanceof IntelligenceMission)){
            throw new MissionTypeException("this vehicle cannot preform this mission");
        } else {
            super.setMission(mission);
        }
    }
}
