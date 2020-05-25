package AerialVehicles.FighterJets;

import AerialVehicles.AerialIntelligenceVehicle;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJet implements AerialIntelligenceVehicle {
    String sensorType;

    public F15(String sensorType) {
        this.sensorType = sensorType;
    }


    @Override
    public void collectIntelligence(){
        System.out.println(getPilotName() + ": " + this.getClass().getSimpleName() +
                " Collecting Data in " + ((IntelligenceMission)this.getMission()).getRegion() +
                getSensorType());
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException{
        if (mission instanceof BdaMission) {
            super.setMission(mission);
        }
        else{
            throw new MissionTypeException("this vehicle cannot preform this mission");
        }
    }

    public String getSensorType() {
        return sensorType;
    }
}
