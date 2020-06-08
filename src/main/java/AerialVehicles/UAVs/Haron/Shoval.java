package AerialVehicles.UAVs.Haron;
import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.UAVs.HaronUAV;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Shoval extends HaronUAV implements AerialBdaVehicle, AerialAttackVehicle, AerialIntelligenceVehicle{
    private String cameraType;
    private int missilesNumber;
    private String missileType;
    private String sensorType;

    public Shoval(String cameraType, int missilesNumber, String missileType, String sensorType, String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.cameraType = cameraType;
        this.missilesNumber = missilesNumber;
        this.missileType = missileType;
        this.sensorType = sensorType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": Shoval Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + this.missileType + "X" + this.missilesNumber;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Shoval Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + this.sensorType;
    }


    @Override
    public String preformBda() {
        return super.getPilotName() + ": Shoval taking pictures of " + ((BdaMission)super.getMission()).getObjective()
                + " with: " + this.cameraType + " camera";
    }
}

