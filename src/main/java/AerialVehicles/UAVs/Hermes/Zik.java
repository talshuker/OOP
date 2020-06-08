package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.UAVs.HermesUAV;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Zik extends HermesUAV implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String cameraType;

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission,
               int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(sensorType, cameraType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Zik Collecting Data in " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with sensor type: " + this.sensorType;
    }

    @Override
    public String preformBda() {
        return super.getPilotName() + ": Zik taking pictures of " + ((BdaMission)super.getMission()).getObjective()
                + " with: " + this.cameraType + " camera";
    }
}
