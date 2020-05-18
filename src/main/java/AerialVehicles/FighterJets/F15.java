package AerialVehicles.FighterJets;

import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJet{
    String sensorType;

    void collectIntelligence(){
        System.out.println(this.pilotName + ": " + this.getClass().getSimpleName() + " Collecting Data, " + this.sensorType);
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException{
        if (!(mission instanceof BdaMission)) {
            super.setMission(mission);
        }
        else{
            throw new MissionTypeException("this vehicle cannot preform this mission");
        }
    }
}
