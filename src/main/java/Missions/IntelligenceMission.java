package Missions;

import AerialVehicles.AerialVehicle;

public class IntelligenceMission extends Mission{
    String sensorType;

    void gatherInformation(){
        System.out.println("Gathering Information.....");

    }

    @Override
    public void activateParticipatingVehicles() {
        for (AerialVehicle aerialVehicle : this.participatingVehicles){
            aerialVehicle.collectIntelligence();
        }
    }
}
