package AerialVehicles.UAVs;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class HermesUAV extends AerialVehicle {
    public HermesUAV(String cameraType, String sensorType, String pilotName, Mission mission,
                     int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
    }
}
