package AerialVehicles.UAVs;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class HaronUAV extends AerialVehicle {
    public HaronUAV(String pilotName, Mission mission,
                    int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);
    }
}
