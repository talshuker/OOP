package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;

public class BdaMission extends Mission {
    String objective;

    public BdaMission(String objective) {
        this.objective = objective;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    @Override
    public void activateParticipatingVehicles() {
        for (AerialVehicle aerialVehicle : this.getParticipatingVehicles()){
            if (aerialVehicle instanceof AerialBdaVehicle) {
                ((AerialBdaVehicle) aerialVehicle).preformBda();
            }
        }
    }
}
