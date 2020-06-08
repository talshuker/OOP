package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import AerialVehicles.UAVs.HermesUAV;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.IntelligenceMission;
import Missions.Mission;

public class Zik extends HermesUAV implements AerialIntelligenceVehicle, AerialBdaVehicle {

    public Zik(String sensorType, String cameraType, String pilotName, Mission mission,
               int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(sensorType, cameraType, pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
    }

    @Override
    public String collectIntelligence() {
        return super.getPilotName() + ": Zik Collecting Data in  " + ((IntelligenceMission)super.getMission()).getRegion()
                + " with: sensor type" + super.getSensorType();
    }


    @Override
    public String preformBda() {
        return super.getPilotName() + ": Zik taking pictures of suspect " + ((BdaMission)super.getMission()).getObjective()
                + " with: " + super.getCameraType();
    }
}
