package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService {
    protected String pilotName;
    protected String engineModel;
    protected Mission mission;
    protected Double wingspan;
    protected Double length;
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
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        this.pilotName = pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) throws MissionTypeException {}

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public Double getWingspan() {
        return wingspan;
    }

    public void setWingspan(Double wingspan) {
        this.wingspan = wingspan;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public int getHoursOfFlightSinceLastRepair() {
        return hoursOfFlightSinceLastRepair;
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
