package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.FighterJet;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJet implements AerialBdaVehicle {
    private String cameraType;

    public F16(String cameraType, int missilesNumber, String missileType, String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(missilesNumber, missileType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": F16 Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + super.getMissileType() + "X" + super.getMissilesNumber();
    }

    @Override
    public String preformBda() {
        return super.getPilotName() + ": F16 taking pictures of " + ((BdaMission)super.getMission()).getObjective()
                + " with: " + this.cameraType + " camera";
    }
}
