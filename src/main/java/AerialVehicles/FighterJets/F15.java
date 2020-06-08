package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.FighterJet;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJet implements AerialIntelligenceVehicle {
    private String sensorType;

    public F15(String sensorType, int missilesNumber, String missileType,
               String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(missilesNumber, missileType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": F15 Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + super.getMissileType()+ "X" + super.getMissilesNumber();
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": F15 Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + this.sensorType;
    }
}
