package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends Hermes implements AerialAttackVehicle {
    int amountOfMissile;
    String missileModel;

    public Kochav(int amountOfMissile, String missileModel) {
        this.amountOfMissile = amountOfMissile;
        this.missileModel = missileModel;
    }


    @Override
    public void attack() {
        System.out.println(this.getPilotName() + ": " + this.getClass().getSimpleName() +
                " Attacking " + ((AttackMission) this.getMission()).getTarget() +
                this.getMissileModel() + "X" + this.getAmountOfMissile());
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException{
        super.setMission(mission);
    }

    public int getAmountOfMissile() {
        return this.amountOfMissile;
    }

    public String getMissileModel() {
        return this.missileModel;
    }
}
