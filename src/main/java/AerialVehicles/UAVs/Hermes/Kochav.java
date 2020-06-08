package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.UAVs.HermesUAV;
import Missions.*;

public class Kochav extends HermesUAV implements AerialAttackVehicle, AerialIntelligenceVehicle, AerialBdaVehicle{
    private int missilesNumber;
    private String missileType;
    private String sensorType;
    private String cameraType;

    public Kochav(int missilesNumber, String missileType, String cameraType, String sensorType, String pilotName,
                  Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(sensorType, cameraType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.missilesNumber = missilesNumber;
        this.missileType = missileType;
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String attack() {
        return super.getPilotName() + ": Kochav Attacking " + ((AttackMission)super.getMission()).getTarget()
                + " with: " + this.missileType + "X" + this.missilesNumber;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Kochav Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + this.sensorType;
    }


    @Override
    public String preformBda() {
        return super.getPilotName() + ": Kochav taking pictures of " + ((BdaMission)super.getMission()).getObjective()
                + " with: " + this.cameraType + " camera";
    }
}
