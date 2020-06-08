package AerialVehicles;

import Missions.Mission;

public abstract class FighterJet extends AerialVehicle implements AerialAttackVehicle{
    private int missilesNumber;
    private String missileType;

    public FighterJet(int missilesNumber, String missileType, String pilotName, Mission mission,
                      int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        super(pilotName, mission, flightHoursSinceLastPatch, isReadyForFlight);

        this.missilesNumber = missilesNumber;
        this.missileType = missileType;
    }

    public String getMissileType() {
        return missileType;
    }

    public int getMissilesNumber() {
        return missilesNumber;
    }
}
