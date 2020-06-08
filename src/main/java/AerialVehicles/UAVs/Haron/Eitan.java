package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.UAVs.HaronUAV;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Eitan extends HaronUAV implements AerialAttackVehicle, AerialIntelligenceVehicle{
    private int missilesNumber;
    private String missileType;
    private String sensorType;

    public Eitan(int missilesNumber, String missileType, String sensorType, String pilotName,
                 Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.missilesNumber = missilesNumber;
        this.missileType = missileType;
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": Eitan Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + this.missileType + "X" + this.missilesNumber;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Eitan Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + this.sensorType;
    }
}
