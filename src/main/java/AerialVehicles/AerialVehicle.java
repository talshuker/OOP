package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    protected String pilotName;
    protected Mission mission;
    protected int hoursOfFlightSinceLastRepair;
    protected Boolean readyToFly;

    @Override
    public void flyTo(Coordinates coordinates) {
        System.out.println("Flying to " + coordinates);
    }

    @Override
    public void land() {
        System.out.println("Landing....");
    }

    @Override
    public void repair() {
        setReadyToFly(true);
        setHoursOfFlightSinceLastRepair(0);
    }

    public String getPilotName() {
        return this.pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return this.mission;
    }

    public void setMission(Mission mission) throws MissionTypeException {}

    public int getHoursOfFlightSinceLastRepair() {
        return this.hoursOfFlightSinceLastRepair;
    }

    public Boolean getReadyToFly() {
        return readyToFly;
    }

    public void setHoursOfFlightSinceLastRepair(int hoursOfFlightSinceLastRepair) {
        this.hoursOfFlightSinceLastRepair = hoursOfFlightSinceLastRepair;
    }

    public void setReadyToFly(Boolean readyToFly) {
        this.readyToFly = readyToFly;
    }
}
