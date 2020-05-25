package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.UAVs.UAV;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public abstract class Haron extends UAV implements AerialAttackVehicle {
    private static final int MAX_HOURS_AFTER_REPAIR = 150;
    int amountOfMissile;
    String missileModel;


    @Override
    public void attack() {
        System.out.println(this.getPilotName() + ": " + this.getClass().getSimpleName() +
                " Attacking " + ((AttackMission) this.getMission()).getTarget() +
                this.getMissileModel() + "X" + this.getAmountOfMissile());

    }

    @Override
    public void check() {
        if (this.getHoursOfFlightSinceLastRepair() >= MAX_HOURS_AFTER_REPAIR){
            this.repair();
        }
    }

    public int getAmountOfMissile() {
        return amountOfMissile;
    }

    public String getMissileModel() {
        return this.missileModel;
    }


}
