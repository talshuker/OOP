package AerialVehicles.FighterJets;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.FighterJets.FighterJet;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJet implements AerialBdaVehicle {
    String cameraType;

    public F16(String cameraType) {
        this.cameraType = cameraType;
    }

    @Override
    public void preformBda() {
        System.out.println(this.getPilotName() + ": " + this.getClass().getSimpleName() +
                " taking pictures of " + ((BdaMission) this.getMission()).getObjective() +
                this.getCameraType());
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException{
        if (mission instanceof IntelligenceMission) {
            super.setMission(mission);
        }
        else{
            throw new MissionTypeException("this vehicle cannot preform this mission");
        }
    }

    public String getCameraType() {
        return this.cameraType;
    }
}
