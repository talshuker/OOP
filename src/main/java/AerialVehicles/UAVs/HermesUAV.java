package AerialVehicles.UAVs;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class HermesUAV extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private String sensorType;
    private String cameraType;

    public HermesUAV(String cameraType, String sensorType, String pilotName, Mission mission,
                     int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
        this.sensorType = sensorType;
        this.cameraType = cameraType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public String getCameraType() {
        return cameraType;
    }
}
