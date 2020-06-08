package AerialVehicles.UAVs.Haron;
import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.UAVs.HaronUAV;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Shoval extends HaronUAV implements AerialBdaVehicle {
    private String cameraType;

    public Shoval(String cameraType, int missilesNumber, String missileType, String sensorType, String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(missilesNumber, missileType, sensorType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": Shoval Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + this.getMissileType() + "X" + this.getMissilesNumber();
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Shoval Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + super.getSensorType();
    }


    @Override
    public String preformBda() {
        return super.getPilotName() + ": Shoval taking pictures of " + ((BdaMission)super.getMission()).getObjective()
                + " with: " + this.cameraType + " camera";
    }
}

