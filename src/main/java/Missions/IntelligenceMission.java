package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;

public class IntelligenceMission extends Mission{
    String region;

    public IntelligenceMission(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public void activateParticipatingVehicles() {
        for (AerialVehicle aerialVehicle : this.getParticipatingVehicles()){
            if (aerialVehicle instanceof AerialIntelligenceVehicle) {
                ((AerialIntelligenceVehicle) aerialVehicle).collectIntelligence();
            }
        }
    }
}
