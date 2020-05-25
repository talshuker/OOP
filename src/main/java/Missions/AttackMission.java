package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;

public class AttackMission extends Mission {
    String target;

    public AttackMission(String target) {
        this.target = target;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Override
    public void activateParticipatingVehicles() {
        for (AerialVehicle aerialVehicle : this.getParticipatingVehicles()) {
            if (aerialVehicle instanceof AerialAttackVehicle) {
                ((AerialAttackVehicle) aerialVehicle).attack();
            }
        }
    }
}
