package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialBdaVehicle;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends Haron implements AerialBdaVehicle {
    String cameraType;

    public Shoval(String cameraType) {
        this.cameraType = cameraType;
    }

    @Override
    public void preformBda() {
        System.out.println(this.getPilotName() + ": " + this.getClass().getSimpleName() +
                " taking pictures of " + ((BdaMission) this.getMission()).getObjective() +
                this.getCameraType());
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        super.setMission(mission);
    }


    public String getCameraType() {
        return this.cameraType;
    }
}

