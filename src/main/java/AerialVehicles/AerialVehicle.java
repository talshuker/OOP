package AerialVehicles;

import AerialVehicles.UAVs.HaronUAV;
import AerialVehicles.UAVs.HermesUAV;
import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle {
    private String pilotName;
    private Mission mission;
    private int flightHoursSinceLastPatch;
    private boolean isReadyForFlight;

    public AerialVehicle(String pilotName, Mission mission, int flightHoursSinceLastPatch, boolean isReadyForFlight) {
        this.pilotName = pilotName;
        this.mission = mission;
        this.flightHoursSinceLastPatch = flightHoursSinceLastPatch;
        this.isReadyForFlight = isReadyForFlight;
    }


    public void flyTo() {
        System.out.println("Flying to: " + this.mission.getDestination().getLatitude() + "," + this.mission.getDestination().getLongitude());
    }

    public void land() {
        System.out.println("Landing");
    }

    public void check() {
        if (this instanceof FighterJet && this.flightHoursSinceLastPatch > 250 ||
            this instanceof HermesUAV && this.flightHoursSinceLastPatch > 100 ||
            this instanceof HaronUAV && this.flightHoursSinceLastPatch > 150) {
            repair();
        }
        System.out.println("checking");
    }

    public void repair() {
        this.isReadyForFlight = true;
        this.flightHoursSinceLastPatch = 0;
        System.out.println("repair");
    }

    public String getPilotName() {
        return pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public int getFlightHoursSinceLastPatch() {
        return flightHoursSinceLastPatch;
    }

    public boolean isReadyForFlight() {
        return isReadyForFlight;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }

    public void setHoursOfFlightSinceLastRepair(int hours) {
        this.flightHoursSinceLastPatch = hours;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return this.flightHoursSinceLastPatch;
    }
}
