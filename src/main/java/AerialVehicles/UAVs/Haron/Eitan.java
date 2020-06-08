package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.UAVs.HaronUAV;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Eitan extends HaronUAV {

    public Eitan(int missilesNumber, String missileType, String sensorType, String pilotName,
                 Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(missilesNumber, missileType, sensorType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": Eitan Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + super.getMissileType() + "X" + this.getMissilesNumber();
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Eitan Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + this.getSensorType();
    }
}
